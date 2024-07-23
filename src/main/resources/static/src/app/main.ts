import { AppComponent } from './app.component';
import { ListaClientesComponent } from './lista-clientes/lista-clientes.component';
import { bootstrapApplication } from '@angular/platform-browser';
import { provideRouter } from '@angular/router';
import { routes } from './app-routing.module';
import { provideClientHydration } from '@angular/platform-browser';
import { provideZoneChangeDetection } from '@angular/core';
import { provideHttpClient } from '@angular/common/http';  // Importar provideHttpClient


bootstrapApplication(AppComponent, {
  providers: [
    provideRouter(routes),
    provideClientHydration(),
    provideZoneChangeDetection({ eventCoalescing: true }),
    provideHttpClient(),
   
    // Puedes agregar HttpClientModule como un proveedor, pero normalmente solo necesitas configurarlo en la raíz de tu aplicación
  ]
}).catch(err => console.error(err));
