import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedcar;

  cars = [
    {
    imgUrl : 'https://cdn.pixabay.com/photo/2012/04/12/23/48/car-30990__340.png',
    name : 'Lamborghini'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2018/01/19/20/56/truck-3093197__340.png',
    name : 'Audi'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/04/13/20/36/mercedes-1327610__340.jpg',
    name : 'Benze'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/11/18/12/51/automobile-1834274__340.jpg',
    name : 'BMW'
  },
]

  constructor() { }

  ngOnInit() {
  }

  sendcar(car) {
    console.log(car);
    this.selectedcar = car;
  }

}
