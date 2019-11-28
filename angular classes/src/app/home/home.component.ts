import { Component } from "@angular/core";
import { HttpClient } from '@angular/common/http';




@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})





export class HomeComponent {
    news : any;
    constructor(private http : HttpClient) {
     this.getNews();
    }

    getNews(){
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=6a3f31ace8344de4845c99e7d2bf7dca').subscribe(data =>{
          this.news = data.articles;
        },err =>{
            console.log(err);
        },()=>{
            console.log('news get successfully');
        })


    }
}