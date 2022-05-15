import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Credentials } from '../models/Credentials.mode';
import { PhotographerService } from '../services/photographer.service';

@Component({
  selector: 'app-photographer',
  templateUrl: './photographer.component.html',
  styleUrls: ['./photographer.component.scss']
})
export class PhotographerComponent implements OnInit {
  photographerId:number;
  photographer:Credentials;
  portofolioData:any = [];
  displayedColumns : string[] = ['imgURL','category','price','action'];
  constructor(private route:ActivatedRoute,private photographerService:PhotographerService) { }
 
  ngOnInit(): void {
     


    }  
    initPortofolio(){
      this.photographerService.getPhotos().subscribe(data =>{
        this.portofolioData = data;
        console.log(this.portofolioData);
      })
    }
  }
