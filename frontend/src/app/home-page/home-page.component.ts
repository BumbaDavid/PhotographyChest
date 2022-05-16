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

  categoryId: number;

  photos: any = [];

  constructor(private homeService: HomeServiceService, private dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.initCategories();
  }

  initCategories() {
    this.homeService.getCategories().subscribe(data => {
      this.categoriesData = data;
      console.log(this.categoriesData);
    });
  }

  displayPhotos(id: number) {
    this.categoryId = id;
    this.photos = [];

    for (let i = 0; i < this.categoriesData.length; i++) {
      if (this.categoriesData[i].id == id) {
        let j = 0;
        while (1 == 1) {
          if (!this.categoriesData[i].photos[j]) {
            break;
          }
          this.photos.push(this.categoriesData[i].photos[j])
          j++;
        }
        break;
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


  sort(event: any) {
    console.log(event.target.value);
    switch (event.target.value) {
      case "Low": {
        this.photos = this.photos.sort((low:any, high:any) => low.price - high.price);
        break;
      }

      case "High": {
        this.photos = this.photos.sort((low:any, high:any) => high.price - low.price);
        break;
      }

      default: {
        this.photos = this.photos.sort((low:any, high:any) => low.price - high.price);
        break;
      }

    }
    console.log(this.photos);
    return this.photos;
  }
}
