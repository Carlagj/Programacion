package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_19 {
    static void main() {

        //Escribir un programa en Java que lea un número entero por el teclado e imprima todos los números impares menores que él.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        System.out.println("Numeros impares menores que " + numero + ":");

        // bucle
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
