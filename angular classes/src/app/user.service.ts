import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  firebaseURl = 'https://ust-ty-9f54a.firebaseio.com/';

  constructor(public http: HttpClient) { }
  postUser(data){
    console.log('service',data);
    return this.http.post(`${this.firebaseURl}/user.json`, data);

  }
  getUsers(){
    return this.http.get(`${this.firebaseURl}/user.json`).pipe(
      map(data => {
        let newArray = [];
        for(let key in data){
          newArray.push({...data[key], id : key });
        }
        return newArray;
      })
    )
  }

  updateUser(id , data){
    return this.http.put(`${this.firebaseURl}/user/${id}.json`,data);

  }

  deleteUser(id){

    return this.http.delete(`${this.firebaseURl}/user/${id}.json`);

  }
}
