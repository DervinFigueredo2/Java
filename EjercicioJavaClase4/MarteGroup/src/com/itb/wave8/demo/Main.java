package com.itb.wave8.demo;

import com.itb.wave8.demo.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<IInvitado> invitados = new ArrayList<>();
        invitados.add(new InvitadoMeli("Simon","Munoz","102361616"));
        invitados.add(new Invitado("Michelangelo","Tortuga","5"));
        invitados.add(new InvitadoMeli("Daniel","Perea","102391278"));
        invitados.add(new Invitado("Leonardo","Tortuga","2"));
        invitados.add(new InvitadoMeli("Dervin","Figueredo","6181827817"));
        invitados.add(new Invitado("Raphael","Tortuga","3"));
        invitados.add(new InvitadoMeli("Juan","Zablosky","181267187"));
        invitados.add(new Invitado("Donatello","Tortuga","4"));
        invitados.add(new Invitado("Splinter","Master","1"));

        FuegosArtificiales f1 = new FuegosArtificiales("Volador","Naranja","BUSSSH");

        PackFuegosArtificiales pack1 = new PackFuegosArtificiales();

        pack1.addFuegosArtificiales(f1);
        pack1.addFuegosArtificiales(new FuegosArtificiales("Circular","Azul","GUISHH"));

        PackFuegosArtificiales pack2 = new PackFuegosArtificiales();

        pack2.addFuegosArtificiales(pack1);
        pack2.addFuegosArtificiales(new FuegosArtificiales("Cuadrado","Negro","PUMM"));

        Evento evento = new Evento(invitados,pack2);

        evento.soplarVelas();

    }
}
