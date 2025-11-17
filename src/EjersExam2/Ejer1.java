package EjersExam2;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del árbol: ");
        int n = sc.nextInt();

        // Parte del árbol
        for (int i = 1; i <= n; i++) {

            // Espacios
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Estrellas
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Tronco: un palo por cada 5 niveles (mínimo 1)
        int tronco = Math.max(1, n / 5);

        for (int i = 0; i < tronco; i++) {

            // Espacios para centrar el tronco
            for (int j = 0; j < n - 1; j++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }

        sc.close();
    }
}
