import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {OrdersModel} from "../models/Orders.model";
import { Observable,map } from 'rxjs';
import {environment} from "../../environments/environment";
import {DeclinedModel} from "../models/Declined.model";

@Injectable({
  providedIn: 'root'
})

export class OrdersService {

  constructor(private http : HttpClient) { }

  saveOrder(orderId : number) : Observable<any>{
    return this.http.post<any>(environment.saveOrder,orderId);
  }

  getOrders() : Observable<any>{
    return this.http.get<any>(environment.getOrder).pipe(
      map((data : any)=> data)
    )
  }

  getBoughtPhotos() : Observable<any>{
    return this.http.get<any>(environment.boughtPhotos).pipe(
      map((data : any) => data)
    )
  }
  acceptOrder(id : number){
    return this.http.post(environment.acceptOrder,id);
  }

  rejectOrders(declined : DeclinedModel){
    return this.http.post(environment.rejectOrder,declined);
  }
}