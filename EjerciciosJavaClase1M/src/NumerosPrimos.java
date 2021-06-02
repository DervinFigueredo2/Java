import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int numeroMaximo = scanner.nextInt();

        for (int i = 0; i < numeroMaximo; i++) {
            if (NumeroPrimo.isPrime(i)) {
                System.out.println(i);
            }
        }
    }

}