import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HomeServiceService {

  constructor(private http : HttpClient) {}


  getCategories() : Observable<any> {
    return this.http.get(environment.categories);
  }

  getAllPhotos() : Observable<any> {
    return this.http.get(environment.photos);
  }
}
