package com.example.lab2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "trabajadores")
public class Trabajadores {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "dni")
    private String dni;
    @ManyToOne
    @JoinColumn(name = "idsede")
    private Sedes idsede;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "correo")
    private String correo;



}
