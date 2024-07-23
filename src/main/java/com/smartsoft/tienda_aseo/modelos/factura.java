package com.smartsoft.tienda_aseo.modelos;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter @Setter
public class factura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num_factura")
    private Long num_factura;
    @Column(name = "id_cliente")
    private Long id_cliente;
    @Column(name = "fecha")
    private String fecha;

}
