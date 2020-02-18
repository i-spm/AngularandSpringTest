import { Injectable } from '@angular/core';
import { Product } from '../model/product.model';
import { Observable, Subject } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {
  baseUrl = environment.baseUrl;
 filter=new Subject();
  constructor(private httpClient:HttpClient) { }
  addProduct(product: Product): Observable<void> {
    const httpOptions = {
        headers: new HttpHeaders({
            'Content-Type': 'application/json',
            

        })

    };
    return this.httpClient.put<void>(this.baseUrl + "/add-product", product, httpOptions);
}

getProducts(): Observable<any> {
  const httpOptions = {
      headers: new HttpHeaders({
          'Content-Type': 'application/json',
        
      })

  };
  return this.httpClient.get<Product[]>(this.baseUrl + "/get-products", httpOptions);
}

}
