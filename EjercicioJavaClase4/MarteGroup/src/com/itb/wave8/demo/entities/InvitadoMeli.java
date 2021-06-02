package com.itb.wave8.demo.entities;

public class InvitadoMeli extends Invitado {

    public InvitadoMeli(String nombre, String apellido, String identificacion) {
        super(nombre, apellido, identificacion);
    }

    @Override
    public void comerTorta() {
        super.comerTorta();
        gritar();
    }

    public void gritar() {
        System.out.println("Viva la Chiqui!!");
    }
}