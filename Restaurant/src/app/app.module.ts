import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import {MatInputModule} from '@angular/material/input';
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatSelectModule} from '@angular/material/select';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { MatToolbarModule, MatIconModule, MatButtonModule } from '@angular/material';

import { FoodsComponent } from'./foods/foods.component';
import { OrderComponent } from './order/order.component';

import { RoutingModule } from './routing/routing.module';


@NgModule({
  declarations: [
    AppComponent,
    FoodsComponent,
    OrderComponent
  
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatInputModule,
    RoutingModule,
    MatButtonToggleModule,
    MatSelectModule,
    FormsModule,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }[]