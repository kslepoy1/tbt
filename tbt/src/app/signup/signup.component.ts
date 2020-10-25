import { Component, OnInit } from '@angular/core';
import { Form, FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { SignupService } from '../services/signup.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {
  id: number;
  form: FormGroup;
  constructor(private service: SignupService,
              private router: Router,
              private formBuilder: FormBuilder) { 

  }
  ngOnInit(){
    this.setUpForm();
  }
  setUpForm(){
    this.form = this.formBuilder.group(
      {name: "",
      major: "",
      image: ""}
    )
  }
  continue(e) {
    this.router.navigate(['/communities',
    {id: this.service.saveInitSignUpInfo(this.form.value).id}
    ]);
  }
}
