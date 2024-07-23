import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from './cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private URL="http://localhost:8080/api/listaCliente";

  constructor(private http: HttpClient) { }

    listaEmpleados():Observable<Cliente[]>{
      return this.http.get<Cliente[]>(`${this.URL}`);
    
   }
}
