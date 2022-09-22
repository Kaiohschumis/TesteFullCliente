import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ClienteComponent } from "./cliente/cliente.component";
import { LoginComponent } from "./login/login.component";

const APP_ROUTES: Routes = [
    {path:"login",component:LoginComponent},
    {path: "home", component: ClienteComponent},

];

@NgModule({
    imports: [RouterModule.forRoot(APP_ROUTES)],
    exports: [RouterModule]
})
export class AppRoutingModule { }