package com.example.lab2.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "inventario", schema = "bicicentro", catalog = "")
public class Inventario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idinventario")
    private int idinventario;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "idtipo")
    private int idtipo;
    @Basic
    @Column(name = "numeroserie")
    private String numeroserie;
    @Basic
    @Column(name = "idsede")
    private int idsede;
    @Basic
    @Column(name = "idmarca")
    private int idmarca;
    @Basic
    @Column(name = "estado")
    private String estado;

    public int getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    public int getIdsede() {
        return idsede;
    }

    public void setIdsede(int idsede) {
        this.idsede = idsede;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
