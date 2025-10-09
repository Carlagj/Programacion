package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
    final double IVA = 0.21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");

        double precioSinIVA = scanner.nextDouble();

        double precioConIVA = precioSinIVA * (1 + IVA);

        System.out.println("El precio con IVA es: " + precioConIVA);

        scanner.close();
    }
}
