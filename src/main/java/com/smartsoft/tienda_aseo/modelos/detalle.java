package com.smartsoft.tienda_aseo.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num_detalle")
    private Long num_detalle;
    @Column(name = "id_factura")
    private Long id_factura;
    @Column(name = "id_producto")
    private Long id_producto;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "precio")
    private Double precio;



    @Override
    public String toString() {
        return "detalle{" +
                "num_detalle=" + num_detalle +
                ", id_factura=" + id_factura +
                ", id_producto=" + id_producto +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
