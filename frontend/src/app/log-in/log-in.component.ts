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
  selectedRole : number;
  create = false;
  credentialsData : any = [];
  roles : any[] = [
    {value : '1', viewValue : 'Customer'},
    {value : '0', viewValue:'Photographer'},
    ]; 
   
  credForm = this._formBuilder.group({
    username : ['',Validators.required],
    password : ['',Validators.required]
  })

  constructor(private _formBuilder : FormBuilder, private credentialsService : CredentialsService) { }


  ngOnInit(): void {
    this.initCredentials();
  }

  action(){
    this.create = !this.create;
  }


  accCreated(){

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
      password : this.credForm.value.password,
      role : this.selectedRole
    }
    
    console.log(credentials);

    for(let i=0;i<this.credentialsData.length;i++){
      if(
        this.credentialsData[i].username == credentials.username &&
        this.credentialsData[i].password == credentials.password &&
        this.credentialsData[i].role == credentials.role
      ){
          value = true;
      }
    }
     console.log(value);
  }


  createAcc(){
    let unique = true;
    let credentials : Credentials = {
      username : this.credForm.value.username,
      password : this.credForm.value.password,
      role : this.selectedRole
    }
    
    console.log(credentials);

    for(let i=0;i<this.credentialsData.length;i++){
      if(this.credentialsData[i].username == credentials.username &&
        this.credentialsData[i].role == credentials.role){
          console.log("An account with that username and role already exists");
          unique = false;
          break;
      }
    }

    if(unique == true){
      this.credentialsService.saveCredentials(credentials).subscribe();
    }
  }
}
