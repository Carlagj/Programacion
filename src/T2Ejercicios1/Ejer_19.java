package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_19 {
    static void main() {
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
