package T2Ejrs2;

import java.util.Scanner;

public class Ejer_10 {
    //Igual que el anterior, pero el valor de N se leerá por teclado.
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantos terminos de la serie Fibonacci quieres mostrar?");
        int N = scanner.nextInt();

        // primeros dos terminos
        int a = 0, b = 1;

        System.out.println("los primeros " + N + "Terminos de la serie Fibonacci son: ");

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");

            // Calcular el siguiente numero de serie
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        scanner.close();
    }
}
