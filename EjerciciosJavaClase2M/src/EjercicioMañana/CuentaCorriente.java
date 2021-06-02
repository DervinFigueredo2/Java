package EjercicioMañana;

public class CuentaCorriente {
    private Double saldo;

    public CuentaCorriente() {
        saldo = 0.0;
    }

    public CuentaCorriente(Double saldo) {
        saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorrienteACopiar) {
        saldo = cuentaCorrienteACopiar.getSaldo();
    }

    public void ingreso(Double cantidadDineroAingresar) {
        this.saldo = this.saldo + cantidadDineroAingresar;
    }

    public void egreso(Double cantidadDeDineroAEgresar) {
        if (cantidadDeDineroAEgresar > this.saldo) {
            throw new RuntimeException("No tienes sufiente dinero para extraer");
        }
        this.saldo = this.saldo - cantidadDeDineroAEgresar;
    }

    public void reintegro(Double cantidadDeDineroAReintegrar) {
        this.ingreso(cantidadDeDineroAReintegrar);
    }

    public void transferencia(Double cantidadDeDineroAtransferir, CuentaCorriente cuentaDestino) {
        this.egreso(cantidadDeDineroAtransferir);
        cuentaDestino.ingreso(cantidadDeDineroAtransferir);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}