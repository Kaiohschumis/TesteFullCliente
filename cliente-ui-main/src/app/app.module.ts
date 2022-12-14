import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {ClienteComponent} from './cliente/cliente.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {ClienteService} from "./service/cliente.service";
import { AppRoutingModule } from './app.routing';
import { LoginComponent } from './login/login.component';




@NgModule({
  declarations: [
    AppComponent,
    ClienteComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,

    
  ],
  providers: [ClienteService],
  bootstrap: [AppComponent]
})
export class AppModule {
}

