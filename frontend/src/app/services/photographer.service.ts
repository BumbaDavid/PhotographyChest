import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { map, Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Credentials } from '../models/Credential.model';
import {PhotoModel} from "../models/Photo.model";

@Injectable({
  providedIn: 'root'
})
export class PhotographerService {


  constructor(private http : HttpClient) { }

  getPortofolio(id:number):Observable<Credentials>{
    return this.http.get(`${environment.account}/${id}`);
  }

  getActiveAccount() : Observable<any>{
    return this.http.get(environment.portofolio).pipe(
      map((data: any)=>data)
    )
  }
  deletePortofolio(id : number){
    return this.http.delete(`${environment.delete}/${id}`);
  }
}