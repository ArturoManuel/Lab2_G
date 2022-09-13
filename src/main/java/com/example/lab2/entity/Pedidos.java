package com.example.lab2.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pedidos", schema = "bicicentro", catalog = "")
public class Pedidos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idpedido")
    private int idpedido;
    @Basic
    @Column(name = "codigoOrden")
    private String codigoOrden;
    @Basic
    @Column(name = "nombreCliente")
    private String nombreCliente;
    @Basic
    @Column(name = "dniCliente")
    private String dniCliente;
    @Basic
    @Column(name = "apellidoCliente")
    private String apellidoCliente;
    @Basic
    @Column(name = "id_inventario")
    private int idInventario;

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public String getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(String codigoOrden) {
        this.codigoOrden = codigoOrden;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedidos that = (Pedidos) o;
        return idpedido == that.idpedido && idInventario == that.idInventario && Objects.equals(codigoOrden, that.codigoOrden) && Objects.equals(nombreCliente, that.nombreCliente) && Objects.equals(dniCliente, that.dniCliente) && Objects.equals(apellidoCliente, that.apellidoCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpedido, codigoOrden, nombreCliente, dniCliente, apellidoCliente, idInventario);
    }
}
