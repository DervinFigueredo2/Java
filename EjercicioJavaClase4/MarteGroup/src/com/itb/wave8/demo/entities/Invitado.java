package com.itb.wave8.demo.entities;

public class Invitado implements IInvitado{

    private String nombre;
    private String apellido;
    private String identificacion;

    public Invitado() {
        this.nombre = "";
        this.apellido = "";
        this.identificacion = "";
    }

    public Invitado(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


    @Override
    public void comerTorta() {
        System.out.println("Quedo rica la torta");
    }
}
