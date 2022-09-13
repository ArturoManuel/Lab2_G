package com.example.lab2.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ventas", schema = "bicicentro", catalog = "")
@IdClass(VentasEntityPK.class)
public class Ventas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idventa")
    private int idventa;
    @Basic
    @Column(name = "fecha")
    private Timestamp fecha;
    @Basic
    @Column(name = "id_inventario")
    private int idInventario;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "dniTrabajador")
    private String dniTrabajador;

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
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
        Ventas that = (Ventas) o;
        return idventa == that.idventa && idInventario == that.idInventario && Objects.equals(fecha, that.fecha) && Objects.equals(dniTrabajador, that.dniTrabajador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idventa, fecha, idInventario, dniTrabajador);
    }
}
