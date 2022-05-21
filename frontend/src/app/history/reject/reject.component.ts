import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import {DeclinedModel} from "../../models/Declined.model";
import {OrdersService} from "../../services/orders.service";

@Component({
  selector: 'app-reject',
  templateUrl: './reject.component.html',
  styleUrls: ['./reject.component.scss']
})
export class RejectComponent implements OnInit {

  rejectOrderFb = this._formBuilder.group({
    reason : ['']
  })

  constructor(@Inject(MAT_DIALOG_DATA) public data :any, private _formBuilder : FormBuilder, private ordersService : OrdersService) { }

  ngOnInit(): void {
  }

  rejectOrder(id : number){
    let rejectOrder : DeclinedModel ={
      orderId : id,
      reason : this.rejectOrderFb.value.reason
    }
    console.log(rejectOrder);

    this.ordersService.rejectOrders(rejectOrder).subscribe();
  }

}