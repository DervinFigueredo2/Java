import java.util.ArrayList;
import java.util.Scanner;

public class NumerosNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que busca:");
        int cantidadABuscar = scanner.nextInt();
        System.out.println("Ingrese la cantidad que haga match:");
        int cantidadDeMatch = scanner.nextInt();
        System.out.println("Ingrese el valor a buscar:");
        int valorABuscar = scanner.nextInt();
        int buscador = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (cantidadABuscar != 0) {
            if (NumerosNaturales.tieneNValores(cantidadDeMatch, valorABuscar, buscador)) {
                res.add(buscador);
                cantidadABuscar -= 1;
            }
            buscador += 1;
        }
        System.out.println(res);
    }

    public static boolean tieneNValores(int cantidadDeMatch, int valorABuscar, int numeroParaChequear) {
        String numeroParaChequearString = Integer.toString(numeroParaChequear);
        String valorABuscarString = Integer.toString(valorABuscar);
        int aparicionesDeNumero = numeroParaChequearString.length() - numeroParaChequearString.replace(valorABuscarString, "").length();
        return aparicionesDeNumero == cantidadDeMatch;
    }
}
