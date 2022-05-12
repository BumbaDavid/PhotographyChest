import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LogInComponent } from './log-in/log-in.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './modules/material.module';
<<<<<<< HEAD
import { HomePageComponent } from './home-page/home-page.component';
=======
import { PhotographerComponent } from './photographer/photographer.component';

>>>>>>> origin/development

@NgModule({
  declarations: [
    AppComponent,
    LogInComponent,
<<<<<<< HEAD
    HomePageComponent
=======
    PhotographerComponent
>>>>>>> origin/development
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
