import { Component, OnInit } from '@angular/core';
import {OrdersService} from "../services/orders.service";

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.scss']
})
export class OrdersComponent implements OnInit {
  dataSource : any =[];
  displayedColumns:string[]=['imgURL','status','reason'];
  constructor(private ordersService : OrdersService) { }

  ngOnInit(): void {
    this.initOrders();
  }

 initOrders(){
    this.ordersService.getOrders().subscribe(data =>{
      this.dataSource = data;
      console.log(this.dataSource);
    });
 }

}
