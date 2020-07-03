package com.edu.claseextraandroid.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(example = "Robin",required = true)
    @Column(name = "name", nullable = false)
    private String nombre;

    @Column(name = "last_name", nullable = false)
    private String apellido;

    @ManyToOne(cascade = {CascadeType.ALL} )
    private Direccion direccion;

    @Column(name = "nickname", unique = true)
    private String apodo;

    @Column(name = "age")
    private Integer edad;



}
