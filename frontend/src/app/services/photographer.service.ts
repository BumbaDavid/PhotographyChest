import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PhotographerService {
  

  constructor(private http : HttpClient) { }


  getPhotos(id :number) : Observable<any>{
    return this.http.get(`${environment.account}/${id}`);
  }
}
