import {Component, Inject, OnInit} from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import {PhotoModel} from "../../models/Photo.model";
import {OrdersModel} from "../../models/Orders.model";
import {OrdersService} from "../../services/orders.service";

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.scss']
})

export class DialogComponent implements OnInit {
  constructor(@Inject(MAT_DIALOG_DATA) public data :any, private ordersService : OrdersService) { }

  ngOnInit(): void {
  }

  orderPhoto(id : number){
    console.log(id);
    this.ordersService.saveOrder(id).subscribe();
    console.log(id);
  }

}
