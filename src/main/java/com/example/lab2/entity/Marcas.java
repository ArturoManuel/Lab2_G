package com.example.lab2.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "marcas", schema = "bicicentro", catalog = "")
public class Marcas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmarca")
    private int idmarca;
    @Basic
    @Column(name = "nombre")
    private String nombre;

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
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
        Marcas that = (Marcas) o;
        return idmarca == that.idmarca && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmarca, nombre);
    }
}
