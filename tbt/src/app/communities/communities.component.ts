import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SignupService } from '../services/signup.service';

@Component({
  selector: 'app-communities',
  templateUrl: './communities.component.html',
  styleUrls: ['./communities.component.scss']
})
export class CommunitiesComponent implements OnInit {

  communities = [
    'latinx', 
    'black', 
    'women', 
    'BIPOC', 
    'people with disabilities',
    'LGBTQIA+'
  ]
  constructor(private service: SignupService,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
  }
 
  onValueChange(selected){
    this.service.saveCommunities(selected, this.route.snapshot.paramMap.get('id'));
  }
}
