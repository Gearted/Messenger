import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginInscriptionComponent } from './login-inscription/login-inscription.component';
import { MessagerieComponent } from './messagerie/messagerie.component';

const routes: Routes = [
{path: '/', component: LoginInscriptionComponent},
{path: '/home', component: HomeComponent},
{path: '/messagerie', component: MessagerieComponent},];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
