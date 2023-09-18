import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce un número entero:");
        int numero = scanner.nextInt();

        System.out.println("Números de Fibonacci menores que " + numero + ":");

        int fib1 = 0;
        int fib2 = 1;

        while (fib1 < numero) {
            System.out.printf(fib1 + " ");
            int siguienteFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = siguienteFib;
        }

        scanner.close();

    }
}