package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_1 {
    public static void main(String[] args) {

        //Programa Java que lea un número entero y calcule si es par o impar.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero y te dire si es par o impar");

        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("es Cero");
        } else if (numero < 0) {
            System.out.println("Es Negativo");
        }

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }


        scanner.close();
    }
}
