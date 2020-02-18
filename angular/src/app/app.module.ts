import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ShowProductComponent } from './product/show-product/show-product.component';
import { HomeComponent } from './home/home.component';
import { SearchProductComponent } from './product/search-product/search-product.component';
import { ProductServiceService } from './service/product-service.service';
import { AddProductComponent } from './product/add-product/add-product.component';

@NgModule({
  declarations: [
    AppComponent,

    ShowProductComponent,
    HomeComponent,
    SearchProductComponent,
    AddProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
HttpClientModule  

  ],
  providers: [ProductServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
