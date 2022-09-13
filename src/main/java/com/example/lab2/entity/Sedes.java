package com.example.lab2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "sedes")
public class Sedes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsede")
    private int idsede;
    @Column(name = "nombreSede")
    private String nombreSede;
    @Column(name = "direccion")
    private String direccion;

}
