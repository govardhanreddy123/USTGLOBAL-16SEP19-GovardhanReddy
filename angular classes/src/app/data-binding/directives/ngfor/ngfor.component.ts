import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {

  products = [
    {
      img : "https://cdn.pixabay.com/photo/2016/04/15/08/04/strawberries-1330459__340.jpg",
      name : "stawberry",
      price : "123"
    },
    {
      img : "https://cdn.pixabay.com/photo/2015/09/02/12/27/eggs-918437__340.jpg",
      name : "egg",
      price : "234"
    },
    {
      img : "https://cdn.pixabay.com/photo/2016/03/18/01/09/cupcake-1264214__340.png",
      name : "icecream",
      price : "243"
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
