import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.scss']
})
export class UploadComponent implements OnInit {
uploadPhoto = this._formBuilder.group({
  photo : [''],
  category : [''],
  price : ['']
})
  constructor(private _formBuilder : FormBuilder) {
    
   }

  ngOnInit(): void {
  }

}
