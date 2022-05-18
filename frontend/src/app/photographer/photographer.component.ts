import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { map } from 'rxjs';

import { ActiveAccount } from '../models/ActiveAccount.model';
import { Credentials } from '../models/Credentials.model';
import { Portofolio } from '../models/Portofolio.model';

import { Credentials } from '../models/Credential.model';
import { CredentialsService } from '../services/credentials.service';
import { PhotographerService } from '../services/photographer.service';

@Component({
  selector: 'app-photographer',
  templateUrl: './photographer.component.html',
  styleUrls: ['./photographer.component.scss']
})

export class PhotographerComponent implements OnInit {
  photographerId:number;
  photographer:Credentials;
  dataSource:any=[];

  displayedColumns : string[] = ['imgURL','category','price','action'];
  activeAcc: any =[];
  constructor(private route:ActivatedRoute,private photographerService:PhotographerService, private credentialsService : CredentialsService) {
  }

  ngOnInit(): void {


    this.initPortofolio();

    }


   
   initPortofolio(){
      this.photographerService.getActiveAccount().subscribe((response : any) =>{
          this.dataSource = response;
          console.log(this.dataSource);
        }
      );

    }

  deleteFromCart(id : number) {
    this.photographerService.deletePortofolio(id).subscribe(() => {
      this.initPortofolio();
    });



  }
  }