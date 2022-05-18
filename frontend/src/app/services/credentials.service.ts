import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {map} from "rxjs/operators";
import { environment } from 'src/environments/environment';
import { Credentials } from '../models/Credential.model';

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

  saveCredentials(credentials : Credentials) : Observable<Credentials>{
    return this.http.post<Credentials>(`${environment.signUpURL}`,credentials);
  }

  activeAccount(id : number) : Observable<any>{
    return this.http.post<any>(`${environment.activeAccount}`,id);
  }
}
