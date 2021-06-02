package EjercicioMañana;

public class main {
    public static void mainCuentaCorriente(String[] args) {
        CuentaCorriente cuentaEnCero = new CuentaCorriente();
        System.out.println(cuentaEnCero.getSaldo() + " Cuenta inicializada en cero pesos");

        CuentaCorriente cuentaTransferida = new CuentaCorriente();
        cuentaTransferida.ingreso(100.0);
        System.out.println(cuentaTransferida.getSaldo() + " Cuenta con ingreso 100 pesos");

        CuentaCorriente cuentaTransferidaDos = new CuentaCorriente();
        cuentaTransferida.ingreso(100.0);
        CuentaCorriente cuentaCopia = new CuentaCorriente(cuentaTransferida);
        System.out.println(cuentaTransferida.getSaldo() + " Cuenta copia de 100 pesos");

        cuentaCopia.transferencia(50.10, cuentaTransferida);
        System.out.println(cuentaCopia.getSaldo() + " Cuenta que transfiere");
        System.out.println(cuentaTransferida.getSaldo() + " Cuenta que es transferida");
    }
    public static void mainContador(String[] args) {
        Contador contadorEnCero = new Contador();
        System.out.println(contadorEnCero.getValor() + " Arranca en cero por defecto");

        contadorEnCero.incrementar();
        contadorEnCero.incrementar();
        contadorEnCero.incrementar();

        System.out.println(contadorEnCero.getValor() + " incremento tres veces su valor");

        Contador contadorCopia = new Contador(contadorEnCero);

        contadorCopia.decrementar();
        System.out.println(contadorCopia.getValor() + " decremento el valor copiado del contador");

        Contador contadorEnCien = new Contador(100);
        System.out.println(contadorEnCien.getValor() + " creo un contador que arranca en 100");
    }

    public static void mainLibrio(String[] args) {
        Libro harryPotter = new Libro("Harry potter", "9780545582889", "Rowling J. K.");
        System.out.println(harryPotter.toString());

        harryPotter.prestamo();
        System.out.println("¿Esta prestado el libro? " + harryPotter.getEstaPrestado());
    }

    public static void mainFecha(String[] args) {
        Fecha fecha = new Fecha();
        System.out.println(fecha.toString());
    }

    public static void mainStringUtils(String[] args) {
        System.out.println(StringUtil.rpad("HOLA", 'x', 7));
        System.out.println(StringUtil.ltrim("          x"));
        System.out.println(StringUtil.rtrim("x          "));
        System.out.println(StringUtil.trim("      x    "));
        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo", '|', 2));
    }
}