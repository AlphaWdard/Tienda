package com.smartsoft.tienda_aseo.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NonNull

@Getter
@Setter
@RequiredArgsConstructor

public class producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private Long nombre;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "stock")
    private Integer stock;


}
