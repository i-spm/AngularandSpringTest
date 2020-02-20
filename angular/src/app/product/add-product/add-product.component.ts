import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ProductServiceService } from 'src/app/service/product-service.service';
import {Product} from 'src/app/model/product.model';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
isSubmitted: boolean;
addForm:FormGroup;
todaysDate:string;
date:Date;
product:Product;
  constructor(private service:ProductServiceService ,private datePipe: DatePipe) { }

  ngOnInit(): void {
    this.addForm = new FormGroup({
      'productName': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
      'productdesc': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
      'price': new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$')]),
      'discount': new FormControl(null, [Validators.required, Validators.pattern('^[0-9]+$'),Validators.max(100),Validators.min(0)]),
      'dateOfExpiry': new FormControl(null, [Validators.required])
    });

    

    this.todaysDate = this.datePipe.transform(new Date(),'yyyy-MM-dd');

    

    
    



  }
  onSubmitForm(){
     
     this.product={
       productName:this.addForm.get('productName').value,
       productdesc:this.addForm.get('productdesc').value,
       price:this.addForm.get('price').value,
       discount:this.addForm.get('discount').value,
       dateOfExpiry:this.addForm.get('dateOfExpiry').value,

     }
     this.service.addProduct(this.product).subscribe(()=>{
      this.isSubmitted=true;
     })
  }

}
