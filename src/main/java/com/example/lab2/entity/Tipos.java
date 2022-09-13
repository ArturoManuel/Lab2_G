package com.example.lab2.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipos", schema = "bicicentro", catalog = "")
public class Tipos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idtipo")
    private int idtipo;
    @Basic
    @Column(name = "nombre")
    private String nombre;

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tipos that = (Tipos) o;
        return idtipo == that.idtipo && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtipo, nombre);
    }
}
