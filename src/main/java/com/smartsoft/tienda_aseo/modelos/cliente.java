package com.smartsoft.tienda_aseo.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity //Usado para definir a una clase como una entidad JPA
@RequiredArgsConstructor //Inicializa las variables del Constructor
@NoArgsConstructor //Genera automáticamente un constructor sin argumentos en una clase
public class cliente {
    @Id //Señala que el valor a continuación sera la llave primaria de la entidad.
    @GeneratedValue(strategy =GenerationType.AUTO) //Asigna valores automaticos a la llave primaria
    @Getter
    @Setter //caracteristica lombok que permite generar los Getters and Setters sin copiarlos en la clase
    @Column(name="id") //Se asigna el nombre de la fila de la tabla en la DB

    private Long id;
    @NonNull //Usado para que los atributos de la clase no puedan adquirir valores nulos
    @Getter @Setter @Column(name="nombre")
    private String nombre;
    @NonNull @Getter @Setter @Column(name="apellido")
    private String apellido;
    @NonNull @Getter @Setter @Column(name="direccion")
    private String direccion;
    @NonNull @Getter @Setter @Column(name="fecha_nacimiento")
    private String fecha_nacimiento;
    @NonNull @Getter @Setter @Column(name="telefono")
    private String telefono;
    @NonNull @Getter @Setter @Column(name="email")
    private String email;


}
