import {Component, Inject, OnInit} from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import {PhotoModel} from "../../models/Photo.model";

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.scss']
})

export class DialogComponent implements OnInit {
  photo : PhotoModel[] = [];
  constructor(@Inject(MAT_DIALOG_DATA) public data :any) { }

  ngOnInit(): void {
  }

}
