import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {UploadService} from "../services/upload.service";
import {PhotoModel} from "../models/Photo.model";

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.scss']
})
export class UploadComponent implements OnInit {

  uploadPhoto = this._formBuilder.group({
    photo: [''],
    category :[''],
    price: ['']
  })

  constructor(private _formBuilder : FormBuilder,private uploadService : UploadService) { }

  ngOnInit(): void {
  }



  upload(){

    let newPhoto : PhotoModel = {
      photo : this.uploadPhoto.value.photo,
      price : this.uploadPhoto.value.price,
      category : this.uploadPhoto.value.category
    }
    this.uploadService.uploadPhoto(newPhoto).subscribe();
    console.log(newPhoto)
  }

}