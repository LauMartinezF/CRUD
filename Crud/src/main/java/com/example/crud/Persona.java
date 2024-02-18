package com.example.crud;
import java.util.Objects;


public class Persona {

    private String nombre;
    private String apellidos;
    private String id;
    private String telefono;
    private String direccion;
    private String fechaNacimiento;
    private String nit;
    private String email;
    private String tipoPersona;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(getNombre(), persona.getNombre()) && Objects.equals(getApellidos(), persona.getApellidos()) && Objects.equals(getId(), persona.getId()) && Objects.equals(getTelefono(), persona.getTelefono()) && Objects.equals(getDireccion(), persona.getDireccion()) && Objects.equals(getFechaNacimiento(), persona.getFechaNacimiento()) && Objects.equals(getNit(), persona.getNit()) && Objects.equals(getEmail(), persona.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellidos(), getId(), getTelefono(), getDireccion(), getFechaNacimiento(), getNit(), getEmail());
    }

    public Persona(String nombre, String apellidos, String id, String direccion, String telefono, String tipoPersona, String email,String fechaNacimiento, String nit) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoPersona = tipoPersona;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.nit = nit;

    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFecha(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
