import { Component } from '@angular/core';

import { Product } from './Product';

@Component({
  selector: 'app-root',
  template: `
  <h1>{{title}}</h1>
  
  <p>Products:</p>
  <ul
     *ngFor="let hd of products">
    <li>  {{ hd.price }}- {{hd.name}} -{{hd.image}}
      </li>
  </ul>
 
`
})
export class AppComponent {
  title = 'Mobile Brands';
  products = [
    new Product(11123, 'Redmi','[]'),
    new Product(13422, 'Realme','[]'),
    new Product(15611, 'Samsung','[I]'),
    new Product(203000, 'Sony', '[]')
  ];
  myProduct = this.products[0];
}

