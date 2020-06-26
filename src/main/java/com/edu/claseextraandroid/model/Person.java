package com.edu.claseextraandroid.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    private String nombre;
    private String apellido;
    private Direccion direccion;
    private String apodo;
    private Integer edad;


}
