import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { subscribeOn } from 'rxjs';
import { Credentials } from '../models/Credentials.mode';
import { CredentialsService } from '../services/credentials.service';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.scss']
})
export class LogInComponent implements OnInit {

  credentialsData : any = [];

  credForm = this._formBuilder.group({
    username : ['',Validators.required],
    password : ['',Validators.required]
  })

  constructor(private _formBuilder : FormBuilder, private credentialsService : CredentialsService) { }


  ngOnInit(): void {
    this.initCredentials();
  }




  initCredentials(){
    this.credentialsService.getAccounts().subscribe(data =>{
      this.credentialsData = data;
      console.log(this.credentialsData);
    })
  }



  logIn(){

    let value = false;
    let credentials : Credentials = {
      username : this.credForm.value.username,
      password : this.credForm.value.password
    }

    this.credentialsData.forEach((element : any) => {
      if(element.username.equals(credentials.username) && element.password.equals(credentials.password)){
        value = true;
      }
    });

    console.log(credentials);
    console.log(value);
  }


}
