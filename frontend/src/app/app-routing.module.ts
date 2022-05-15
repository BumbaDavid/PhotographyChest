import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { LogInComponent } from './log-in/log-in.component';
import { PhotographerComponent } from './photographer/photographer.component';

const routes: Routes = [
  { path : 'home', component : HomePageComponent},
  { path : 'log-in', component: LogInComponent},
  { path : '', redirectTo: 'log-in', pathMatch: 'full' },
  { path : 'photographer', component: PhotographerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
