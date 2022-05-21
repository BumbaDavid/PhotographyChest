import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LogInComponent } from './log-in/log-in.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './modules/material.module';
import { HomePageComponent } from './home-page/home-page.component';
import { PhotographerComponent } from './photographer/photographer.component';

import { DialogComponent } from './home-page/dialog/dialog.component';
import { FilterPipe } from './pipes/filter.pipe';

import { UploadComponent } from './upload/upload.component';
import { OrdersComponent } from './orders/orders.component';
import { HistoryComponent } from './history/history.component';
import { EditComponent } from './edit/edit.component';

@NgModule({
  declarations: [
    AppComponent,
    LogInComponent,
    HomePageComponent,
    PhotographerComponent,
    DialogComponent,
    FilterPipe,
    UploadComponent,
    OrdersComponent,
    HistoryComponent,
    EditComponent
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
