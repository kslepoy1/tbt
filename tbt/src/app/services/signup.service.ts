import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CurrUserService } from './curr-user.service';
@Injectable({
  providedIn: 'root'
})
export class SignupService {

  signupURL = "";
  signUpData = {
    id: 0,
    name: "",
    major: "",
    image: "",
    type: "",
    communities: [],
    askAbout: []
  }
  signUpURL = "";
  constructor(private http: HttpClient) {
   }

  saveInitSignUpInfo(form){
    this.signUpData.name  = form.name;
    this.signUpData.major = form.major;
    this.signUpData.image = form.image;
    console.log(this.signUpData);
    this.http.post(this.signUpURL, this.signUpData).subscribe(resInfo => {
      this.updateFromResponse(resInfo);
    });
    return this.signUpData;
  }
  updateFromResponse(resInfo){
    this.signUpData = resInfo;
    
  }
  saveCommunities(com, id) {
    this.signUpData.id = id;
    this.signUpData.communities = com;
    console.log(this.signUpData)
    this.http.post(this.signUpURL, this.signUpData).subscribe(resInfo => {
      this.updateFromResponse(resInfo);
    });
  }
}
