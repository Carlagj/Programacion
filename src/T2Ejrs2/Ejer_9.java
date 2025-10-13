package T2Ejrs2;

import java.util.Scanner;

public class Ejer_9 {

    /* Mostrar los N primeros términos de la serie de Fibonacci.
    N se definirá como una variable.
     */

    static void main() {

        int N = 20; // numero de terminos que queremos mostrar

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
    }
}
