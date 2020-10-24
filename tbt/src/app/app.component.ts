
import { ViewEncapsulation } from '@angular/core';
import { Component } from '@angular/core';
import { LandingComponent } from './landing/landing.component';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  encapsulation: ViewEncapsulation.None
})

export class AppComponent {
  static signedIn = false;
  title = 'tbt';

  
}
