import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

  import { HttpClient } from '@angular/common/http';
import {PhotoModel} from "../models/Photo.model";
@Injectable({
  providedIn: 'root'
})
export class PortofolioService {

  constructor(private http : HttpClient) {}


  getPortofolio() : Observable<any> {
    return this.http.get(environment.portofolio);
  }

  getPhotoById(id : number) : Observable<any>{
    return this.http.get(`${environment.account}/photo/${id}`);
  }

  editPhoto(photo : PhotoModel, id : number){
    return this.http.put(`${environment.editPhoto}/${id}`,photo);
  }

}