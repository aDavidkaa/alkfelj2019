import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { FoodsComponent } from'../foods/foods.component';
import { OrderComponent } from '../order/order.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/foods',
    pathMatch: 'full'
  },
  {
    path: 'foods',
    component: FoodsComponent
  },
  {
    path: 'order',
    component: OrderComponent
  },
  {
    path: '**',
    redirectTo: '/',
  },
];

@NgModule({
  imports: [ RouterModule.forRoot(routes)  ],
  exports: [ RouterModule ],
  declarations: []
})
export class RoutingModule { }
