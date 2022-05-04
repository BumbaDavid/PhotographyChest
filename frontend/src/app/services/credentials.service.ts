import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {map} from "rxjs/operators";
import { environment } from 'src/environments/environment';
import { Credentials } from '../models/Credentials.mode';

@Injectable({
  providedIn: 'root'
})
export class CredentialsService {

  constructor(private http: HttpClient) { }


  getAccounts() : Observable<Credentials>{
    return this.http.get(environment.credentialsURL).pipe(
      map((credentials : Credentials) => credentials)
    );
  }
}
