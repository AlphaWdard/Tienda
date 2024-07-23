import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListaClientesComponent } from "./lista-clientes/lista-clientes.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ListaClientesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'tienda_aseo_frontend';
}
