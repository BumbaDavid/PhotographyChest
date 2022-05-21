import { Component, OnInit } from '@angular/core';
import {OrdersService} from "../services/orders.service";

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.scss']
})
export class HistoryComponent implements OnInit {
  dataSource : any =[];
  displayedColumns:string[]=['imgURL','status','buyer','price','action'];
  constructor(private ordersService : OrdersService) { }

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

}