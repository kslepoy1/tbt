import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LandingComponent } from './landing/landing.component';
import { SignupComponent } from './signup/signup.component';
import { CommunitiesComponent } from './communities/communities.component';
import { EventsComponent } from './events/events.component';
import { MeComponent } from './me/me.component';
import { ChatComponent } from './chat/chat.component';
import { DiscoverComponent } from './discover/discover.component';


const routes: Routes = [{path: '',       component: LandingComponent},
                        {path: 'communities',component: CommunitiesComponent},
                        {path: 'signup', component: SignupComponent},
                        {path: 'events', component: EventsComponent},
                        {path: 'me', component: MeComponent},
                        {path: 'chat', component: ChatComponent},
                        {path: 'discover', component: DiscoverComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
