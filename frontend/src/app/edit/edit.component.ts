import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import {PortofolioService} from "../services/portofolio.service";
import { FormBuilder} from '@angular/forms';
import {PhotoModel} from "../models/Photo.model";

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.scss']
})
export class EditComponent implements OnInit {
  photoId : number;
  photo : any;
  editedPhoto = this._formBuilder.group({
    photo:[''],
    category:[''],
    price:['']
  })

  constructor(private _formBuilder : FormBuilder, private route : ActivatedRoute, private portofolioService : PortofolioService) { }

  ngOnInit(): void {
      this.photoId = this.route.snapshot.params['id'];
      this.photo= <any>{};
      this.portofolioService.getPhotoById(this.photoId).subscribe(data =>{
        this.photo= data;
        console.log(this.photo);
      })
  }

  edit(){
    let editedPhoto : PhotoModel = {
      photo : this.editedPhoto.value.photo,
      price : this.editedPhoto.value.price,
      category : this.editedPhoto.value.category
    }
    console.log(editedPhoto);
    this.portofolioService.editPhoto(editedPhoto,this.photoId).subscribe();
  }

}