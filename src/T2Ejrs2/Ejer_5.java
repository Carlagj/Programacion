package T2Ejrs2;

import java.util.Scanner;

public class Ejer_5 {

    //Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura:

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        int numero = scanner.nextInt();

        // bucle externo controla filas
        for (int i = 1; i <= numero; i++) {

            // bucle interno: imprime numeros de 1 hasta i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // salto de linea
            System.out.println();
        }
        scanner.close();
    }

}
