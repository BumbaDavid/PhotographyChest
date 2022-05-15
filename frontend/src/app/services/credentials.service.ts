import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {map} from "rxjs/operators";
import { environment } from 'src/environments/environment';
import { ActiveAccount } from '../models/ActiveAccount.model';
import { Credentials } from '../models/Credentials.model';


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

  activeAccount(credentials : Credentials) : Observable<Credentials>{
    return this.http.post<Credentials>(`${environment.activeAccount}`,credentials);
  }

  getActiveAccount() : Observable<ActiveAccount>{
    return this.http.get(environment.portofolio).pipe(
      map((data: ActiveAccount)=>data)
    )
  }
}
