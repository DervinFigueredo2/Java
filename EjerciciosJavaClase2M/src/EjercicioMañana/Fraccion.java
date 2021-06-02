package EjercicioMañana;

public class Fraccion {
    private int denominador;
    private int numerador;


    public void sumar(Fraccion fraccionASumar) {
        this.denominador = this.denominador * fraccionASumar.denominador;
        this.numerador = this.numerador * fraccionASumar.denominador + fraccionASumar.numerador;
    }

    public void sumar(int numeroASumar) {
        this.numerador = (numeroASumar * this.denominador) + this.numerador;
    }

    public void restar(Fraccion fraccionARestar) {
        this.denominador = this.denominador * fraccionARestar.denominador;
        this.numerador = this.numerador * fraccionARestar.denominador + fraccionARestar.numerador;
    }

    public void restar(int numeroARestar) {
        this.numerador = (numeroARestar * this.denominador) - this.numerador;
    }

    public void multiplicar(Fraccion fraccionAMultiplicar) {
        this.denominador = this.denominador * fraccionAMultiplicar.denominador;
        this.numerador = this.numerador * fraccionAMultiplicar.numerador;
    }

    public void multiplicar(int numeroAMultiplicar) {
        this.numerador = this.numerador * numeroAMultiplicar;
    }

    public void dividir(Fraccion fraccionADividir) {
        this.denominador = this.denominador * this.numerador;
        this.numerador = this.denominador * this.numerador;
    }

    public void dividir(int numeroAdividir) {
        this.denominador = this.denominador * numeroAdividir;
    }

}