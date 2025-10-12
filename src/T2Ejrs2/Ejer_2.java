package T2Ejrs2;

import java.util.Scanner;

public class Ejer_2 {
    /* Realizar un programa que calcule la potencia de un número baseexponente.
   La potencia se hará por medio de multiplicaciones, está prohibido usar Math.pow()
    */
    static void main() {
        Scanner scanner = new Scanner(System.in);
    // pedir por pantalla

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        long resultado = 1;

        // Caso especial: exponente negativo o cero
        if (exponente < 0) {
            System.out.println("El esponente debe ser positivo en esta version.");
        }else {
            for (int i = 1; i <= exponente; i++) {
                resultado *= base; //multiplica
            }
            System.out.println(base + " elevado a " + exponente + " = " + resultado);
        }
        scanner.close();
    }

}
