import { Component, OnInit } from '@angular/core';
import {OrdersService} from "../services/orders.service";
import {PhotoModel} from "../models/Photo.model";
import {DialogComponent} from "../home-page/dialog/dialog.component";
import { MatDialog } from '@angular/material/dialog';
import {RejectComponent} from "./reject/reject.component";

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.scss']
})
export class HistoryComponent implements OnInit {
  dataSource : any =[];
  displayedColumns:string[]=['imgURL','status','buyer','price','action'];
  constructor(private ordersService : OrdersService, private dialog : MatDialog) { }

  ngOnInit(): void {
    this.initOrders();
  }

  initOrders(){
    this.ordersService.getBoughtPhotos().subscribe(data =>{
      this.dataSource = data;
      console.log(this.dataSource);
    });
  }

  acceptOrder(id : number){
    console.log(id);
    this.ordersService.acceptOrder(id).subscribe();
  }

  rejectOrder(photoId : number) {
    let ref = this.dialog.open(RejectComponent, {
      height: '300px',
      width: '300px',
      data: {id : photoId}
    });
  }

}