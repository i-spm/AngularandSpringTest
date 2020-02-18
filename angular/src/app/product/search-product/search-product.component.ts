import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from 'src/app/service/product-service.service';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent implements OnInit {

  constructor(private service:ProductServiceService) { }

  ngOnInit(): void {
  }
  onSearchText(event: any) {
    this.service.filter.next({ title: event.target.value });
  }

}
