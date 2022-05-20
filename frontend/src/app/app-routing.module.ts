import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { LogInComponent } from './log-in/log-in.component';
import { PhotographerComponent } from './photographer/photographer.component';
import { UploadComponent } from './upload/upload.component';
import {OrdersComponent} from "./orders/orders.component";

const routes: Routes = [
  { path : 'home', component : HomePageComponent},
  { path : 'log-in', component: LogInComponent},
  { path : '', redirectTo: 'log-in', pathMatch: 'full' },
  { path : 'photographer', component: PhotographerComponent},
  { path : 'upload', component: UploadComponent},
  {path : 'orders', component : OrdersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
