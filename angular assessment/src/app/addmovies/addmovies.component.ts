import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {

  get text() {
      return this.form.get('text');
  }

  form = new FormGroup({
    text : new FormControl ('',[Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }

}
