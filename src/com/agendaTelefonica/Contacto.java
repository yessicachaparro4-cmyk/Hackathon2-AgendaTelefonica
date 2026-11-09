package com.agendaTelefonica;

public class Contacto {

    private String nombre;
    private String apellido;
    private String telefono;
    private int idContacto;

    public Contacto(String nombre, String apellido, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = numero;
    }
    public void modificarContacto(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getIdContacto() {
        return idContacto;
    }
    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }
}