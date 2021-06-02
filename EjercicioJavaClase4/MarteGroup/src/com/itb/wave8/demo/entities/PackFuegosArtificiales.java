package com.itb.wave8.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class PackFuegosArtificiales implements IEncendible{

    private List<IEncendible> packFuegosArtificiales;

    public PackFuegosArtificiales() {
        this.packFuegosArtificiales = new ArrayList<>();
    }

    public List<IEncendible> getPackFuegosArtificiales() {
        return packFuegosArtificiales;
    }

    public void setPackFuegosArtificiales(List<IEncendible> packFuegosArtificiales) {
        this.packFuegosArtificiales = packFuegosArtificiales;
    }

    public void addFuegosArtificiales (IEncendible fuegoArtificial){
        this.packFuegosArtificiales.add(fuegoArtificial);
    }

    @Override
    public void encender() {
        for (IEncendible pack:this.packFuegosArtificiales) {
            pack.encender();
        }
    }
}
