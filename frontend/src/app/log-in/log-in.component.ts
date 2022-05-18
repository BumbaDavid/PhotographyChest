import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { subscribeOn } from 'rxjs';
import { Credentials } from '../models/Credential.model';
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

  constructor(private _formBuilder : FormBuilder, private credentialsService : CredentialsService, private _snackbar : MatSnackBar, private router : Router) { }


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



  delay = (ms: number) => new Promise(res => setTimeout(res, ms));

   logIn = async () =>{

    let value = false;
    let credentials : Credentials = {
      id : -1,
      username : this.credForm.value.username,
      password : this.credForm.value.password,
      role : this.selectedRole
    }
   let numberC = -1;
    for(let i=0;i<this.credentialsData.length;i++){
      if(
        this.credentialsData[i].username == credentials.username &&
        this.credentialsData[i].password == credentials.password &&
        this.credentialsData[i].role == credentials.role){
          credentials.id = this.credentialsData[i].id;
          numberC = this.credentialsData[i].id;
          value = true;
          this.credentialsService.activeAccount(numberC).subscribe();

          if(this.credentialsData[i].role == 1){
            await this.delay(500)

              this.router.navigate(['/home']);
          }
          else{
            await this.delay(500)

            this.router.navigate(['/photographer']);
          }
          break;
      }
    }
     console.log(credentials);
     console.log(value);
     if(value==false){
       this._snackbar.open("Username or password are incorrect", "Ok");
     }
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
          this._snackbar.open("Username already exists","Ok");
          console.log("An account with that username and role already exists");
          unique = false;
          break;
      }
    }

    if(unique == true){
      this._snackbar.open("Account successfuly created","Ok");
      this.credentialsService.saveCredentials(credentials).subscribe();

    }
  }
}
