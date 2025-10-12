package T2Ejrs2;

import java.util.Scanner;

public class Ejer_1 {
    // Crea un programa que te pida la altura de un triángulo rectángulo y lo muestre con asteriscos.

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la altura del triangulo: ");
        int altura = scanner.nextInt();

        // Bucle externo para cada fila
        for (int i = 1; i <= altura; i++) {
           //Bucle interno para imprimir asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();//salto de linea despues de cada fila
        }
        scanner.close();
    }

}
