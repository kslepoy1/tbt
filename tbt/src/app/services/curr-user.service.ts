import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CurrUserService {
  id: number;
  constructor() { }
  setId(id){
    this.id = id;
  }
}
