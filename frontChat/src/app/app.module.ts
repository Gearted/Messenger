import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { LoginInscriptionComponent } from './pages/login-inscription/login-inscription.component';
import { HomeComponent } from './pages/home/home.component';
import { MessagerieComponent } from './pages/messagerie/messagerie.component';
import { LoginComponent } from './pages/components/login/login.component';
import { InscriptionComponent } from './pages/components/inscription/inscription.component';
import { ContactComponent } from './pages/components/contact/contact.component';
import { ConversationComponent } from './pages/components/conversation/conversation.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginInscriptionComponent,
    HomeComponent,
    MessagerieComponent,
    LoginComponent,
    InscriptionComponent,
    ContactComponent,
    ConversationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
