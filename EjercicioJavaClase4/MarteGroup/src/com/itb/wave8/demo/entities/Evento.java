package com.itb.wave8.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private List<IInvitado> listaInvitados;
    private IEncendible fuegosArtificiales;
    private boolean estaVelaApagada;

    public Evento() {
        this.listaInvitados = new ArrayList<>();
        this.fuegosArtificiales = new PackFuegosArtificiales();
        this.estaVelaApagada = false;
    }

    public Evento(List<IInvitado> listaInvitados, PackFuegosArtificiales fuegosArtificiales) {
        this.listaInvitados = listaInvitados;
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public List<IInvitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(List<IInvitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public IEncendible getFuegosArtificiales() {
        return fuegosArtificiales;
    }

    public void setFuegosArtificiales(IEncendible fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public void soplarVelas() throws Exception {
        if(estaVelaApagada){
            throw new Exception("Ya apagaron la vela y no hay mas pastel, :(");
        }
        this.reventarFuegosArtificiales();
        this.repartirTorta();
        this.estaVelaApagada = true;
    }

    private void reventarFuegosArtificiales() {
        this.fuegosArtificiales.encender();
    }

    private void repartirTorta() {
        this.listaInvitados.forEach(IInvitado::comerTorta);
    }
}
