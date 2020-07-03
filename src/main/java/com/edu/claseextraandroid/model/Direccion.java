package com.edu.claseextraandroid.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String calle;

    /**
     * Transient le decimos a Hibernate que
     * ignore este atributo para el mapeo
     */
    @Transient
    private String algo;
}
