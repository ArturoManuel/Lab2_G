package com.example.lab2.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class VentasEntityPK implements Serializable {
    @Column(name = "idventa")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idventa;
    @Column(name = "dniTrabajador")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dniTrabajador;

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getDniTrabajador() {
        return dniTrabajador;
    }

    public void setDniTrabajador(String dniTrabajador) {
        this.dniTrabajador = dniTrabajador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VentasEntityPK that = (VentasEntityPK) o;
        return idventa == that.idventa && Objects.equals(dniTrabajador, that.dniTrabajador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idventa, dniTrabajador);
    }
}
