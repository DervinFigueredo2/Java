import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para ver si es primo");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println("¿El numero es primo? " + isPrime(numero));
        scanner.close();
    }

    public static boolean isPrime(int numero) {
        boolean isPrime = true;
        int contador = 2;

        while (isPrime && contador < numero) {
            isPrime = numero % contador != 0;
            contador++;
        }
        return isPrime;
    }
}

