import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ShowProductComponent } from './product/show-product/show-product.component';
import { AddProductComponent } from './product/add-product/add-product.component';



const routes: Routes = [
  {path: '' , component:ShowProductComponent},
  {path: "show-product", component:ShowProductComponent },
  {path: "add-product" , component:AddProductComponent},
  {path:"**", component:ShowProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
