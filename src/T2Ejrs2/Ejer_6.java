package T2Ejrs2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejer_6 {
    /*Realiza una aplicación que nos pida un número de ventas a introducir,
    después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
    Al final mostrara la suma de todas las ventas.
    Piensa que es lo que se repite y lo que no.
    */
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantas ventas deseas introducir? ");
        int numeroVentas = scanner.nextInt();

        double sumaVentas = 0; // Acumulador

        // Pedimos tantas ventas
        for (int i = 1; i <= numeroVentas; i++) {
            System.out.println("Introduce el valor de la venta " + i + ": ");
            double venta = scanner.nextDouble();
            sumaVentas += venta; // Sumamos al total
        }
        System.out.println("La suma de la venta es: " + sumaVentas);
        scanner.close();
    }
}
