package T2Ejrs2;

import java.util.Scanner;

public class Ejer_4 {
//Desarrolla un programa que pida un número por teclado y te muestre el número de cifras que tiene.

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();

        // Convertir a positivo para ignorar el signo
        numero = Math.abs(numero);

        int cifras = 0;

        // si es 0 tiene una cifra

        if (numero == 0) {
            cifras = 1;
        }else {
            // cuando el numeros es mayor que 0
            while (numero > 0) {
                numero = numero / 10; // elimina el ultimo digito
                cifras++;             // sumamos una cifra
            }
        }
        System.out.println("El numero tiene " + cifras + " cifras.");
        scanner.close();
    }

}
