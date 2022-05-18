import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable ,map} from 'rxjs';

import { environment } from 'src/environments/environment';
import { PhotoModel } from '../models/Photo.model';

@Injectable({
  providedIn: 'root'
})
export class UploadService {

  constructor(private http : HttpClient) { }



  uploadPhoto(newPhoto : PhotoModel) {
    return this.http.post(environment.upload,newPhoto)
  }
}