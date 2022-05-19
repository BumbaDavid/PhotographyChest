import { Component, OnInit } from '@angular/core';
import { HomeServiceService } from '../services/home-service.service';
import {MatDialog} from "@angular/material/dialog";
import {DialogComponent} from "./dialog/dialog.component";
import {PhotoModel} from "../models/Photo.model";

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent implements OnInit {
  showCategories: boolean = true;
  categoriesData: any = [];
  photosData : any =[];
  categoryId: number;
  photos: any = [];
  order='asc';

  constructor(private homeService: HomeServiceService, private dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.initCategories();
    this.initAllPhotos();
  }

  initCategories() {
    this.homeService.getCategories().subscribe(data => {
      this.categoriesData = data;
      console.log(this.categoriesData);
    });
  }

  initAllPhotos() {
    this.homeService.getAllPhotos().subscribe(data => {
      this.photosData = data;
      console.log(this.photosData);
    });
  }


  displayPhotos(id: number) {
    console.log(id);
    this.categoryId = id;
    this.photos = [];
    for (let i = 0; i < this.photosData.length; i++) {
      if (this.photosData[i].category.id == id) {
        this.photos.push(this.photosData[i]);

      }
    }
    this.showCategories = false;
    console.log(id);
    console.log(this.categoryId);
    console.log(this.photos);
  }

  openDialog(photo: PhotoModel) {
    let ref = this.dialog.open(DialogComponent, {
      height: '600px',
      width: '600px',
      data: {photo: photo, category: this.categoriesData[this.categoryId - 1].category}
    });
  }
}
