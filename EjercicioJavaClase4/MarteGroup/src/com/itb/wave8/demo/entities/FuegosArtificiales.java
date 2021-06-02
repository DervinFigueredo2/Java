package com.itb.wave8.demo.entities;

public class FuegosArtificiales implements IEncendible {

    private String tipo;
    private String color;
    private String sonido;

    public FuegosArtificiales(String tipo, String color, String sonido) {
        this.tipo = tipo;
        this.color = color;
        this.sonido = sonido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public void encender() {
        System.out.println("Explote " + this.tipo + " con el color " + this.color + " y el sonido " + this.sonido);
    }
}
