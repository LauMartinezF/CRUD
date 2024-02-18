package com.example.crud;

import java.util.Objects;

public class Productos {
    String codigo;
    String nombre;
    String descripcion;
    String valorUnitario;
    String cantidadExitencia;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Productos productos)) return false;
        return Objects.equals(getCodigo(), productos.getCodigo()) && Objects.equals(getNombre(), productos.getNombre()) && Objects.equals(getDescripcion(), productos.getDescripcion()) && Objects.equals(getValorUnitario(), productos.getValorUnitario()) && Objects.equals(getCantidadExitencia(), productos.getCantidadExitencia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getNombre(), getDescripcion(), getValorUnitario(), getCantidadExitencia());
    }

    public Productos(String codigo, String nombre, String descripcion, String valorUnitario, String cantidadExitencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantidadExitencia = cantidadExitencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getCantidadExitencia() {
        return cantidadExitencia;
    }

    public void setCantidadExitencia(String cantidadExitencia) {
        this.cantidadExitencia = cantidadExitencia;
    }
}
