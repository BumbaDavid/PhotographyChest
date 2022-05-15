import { NgModule } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatGridListModule } from '@angular/material/grid-list';
import { HttpClientModule } from '@angular/common/http';
import { NgxPaginationModule } from 'ngx-pagination';
import { FormsModule } from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatSortModule} from '@angular/material/sort';
import {MatTableModule} from '@angular/material/table';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatDialogModule} from '@angular/material/dialog';
import {MatDividerModule} from '@angular/material/divider';
import {MatListModule} from '@angular/material/list';
import {MatCardModule} from '@angular/material/card';
import {MatBadgeModule} from '@angular/material/badge';
import {MatStepperModule} from '@angular/material/stepper';
import { ReactiveFormsModule } from '@angular/forms';
import {MatSelectModule} from '@angular/material/select';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {CdkTableModule} from '@angular/cdk/table';


const MaterialComponents =[
  MatSelectModule,
  MatButtonModule,
  MatToolbarModule,
  MatSidenavModule,
  MatSnackBarModule,
  MatGridListModule,
  HttpClientModule,
  NgxPaginationModule,
  FormsModule,
  MatFormFieldModule,
  MatInputModule,
  MatButtonToggleModule,
  MatSortModule,
  MatTableModule,
  MatExpansionModule,
  MatCheckboxModule,
  MatDialogModule,
  MatDividerModule,
  MatListModule,
  MatCardModule,
  MatBadgeModule,
  MatStepperModule,
  ReactiveFormsModule,
  CdkTableModule
];

@NgModule({
  imports:[MaterialComponents],
  exports:[MaterialComponents,]
})
export class MaterialModule { }
