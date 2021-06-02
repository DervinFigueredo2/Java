package EjercicioMañana;

public class Contador {
    private int valor;

    public Contador() {
        valor = 0;
    }

    public Contador(int nuevoValor) {
        valor = nuevoValor;
    }

    public Contador(Contador contadorParaCopiar) {
        this.valor = contadorParaCopiar.getValor();
    }

    public void incrementar() {
        this.setValor(this.getValor() + 1);
    }

    public void decrementar() {
        this.setValor(this.getValor() - 1);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}