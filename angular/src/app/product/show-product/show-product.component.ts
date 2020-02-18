import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/model/product.model';
import { ProductServiceService } from 'src/app/service/product-service.service';

@Component({
  selector: 'app-show-product',
  templateUrl: './show-product.component.html',
  styleUrls: ['./show-product.component.css']
})
export class ShowProductComponent implements OnInit {

  constructor(private service:ProductServiceService) { }
products:Product[];
originalList:Product[];
  ngOnInit(): void {

    this.service.getProducts().subscribe((data:Product[])=>{
this.products=[...data];
this.originalList=this.products;
console.log(this.products);
    });
  }

 /*  this.service.filter.subscribe((obj: { title: string }) => {
    if (obj.title !== '') {
      const result = this.originalList.filter(prod => prod.productName.toLowerCase().includes(obj.title.toLowerCase()));
      this.products = result ? result : [];
    } else {
      this.products = [...this.originalList];
    }
  }); */

}
