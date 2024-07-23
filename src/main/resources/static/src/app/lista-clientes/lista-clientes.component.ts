import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';
import { CommonModule } from '@angular/common';
import { ClienteService } from '../cliente.service';
import { Router } from 'express';

@Component({
  selector: 'app-lista-clientes',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './lista-clientes.component.html',
  styleUrl: './lista-clientes.component.css'
})
export class ListaClientesComponent implements OnInit{
  clientes: Cliente[];

  constructor(private clienteServicio:ClienteService, private router: Router){}

  ngOnInit(): void {
    this.GetClientes();
  
  }

  private GetClientes(){
    this.clienteServicio.listaEmpleados().subscribe(dato => {
     this.clientes= dato;
    });
  }



}

