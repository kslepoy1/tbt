import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.scss']
})
export class EventsComponent implements OnInit {
  testData = [{
    postedBy: "Anita Smith",
    title: "Technica Hackathon",
    location: "Online",
    time: "Saturday, 10:30PM",
    communities: ["women", "lgbtqia+"]
  },{
    postedBy: "Keren Belay",
    title: "Girls Who Code Info Session",
    location: "Tawes Hall",
    time: "Thursday, 1:30PM",
    communities: ["women"]
  },
    {
    postedBy: "Katya Slepoy",
    title: "Study Group for CMSC330 Midterm!",
    location: "McKeldin Library",
    time: "Friday, 3:30PM",
    communities: ["women", "people with disabilities"]
  },
  {
  postedBy: "Katya Slepoy",
  title: "Study Group for CMSC351 Midterm!",
  location: "McKeldin Library",
  time: "Friday, 7:30PM",
  communities: ["women", "people with disabilities"]
}]
  events: {};
  constructor() {
    this.events = this.testData;
   }

  ngOnInit(): void {
    
  }

}
