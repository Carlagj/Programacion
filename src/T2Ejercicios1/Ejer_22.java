package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_22 {
    public static void main(String[] args) {

        /*
        Desarrolla un programa que lea números hasta que se introduzca un número negativo y después indique si se ha dado el mismo número dos veces consecutivas:
        Introduciendo: 1 3 5 3 4 6 7 –1
        Da como salida: No
        Introduciendo: 1 3 5 6 6 4 3 –1
        Da como salida : Si

        do while hacer
         */

        Scanner scanner = new Scanner(System.in);
        int numeroAnterior = Integer.MIN_VALUE;
        boolean repetidoConsecutivo = false;

        System.out.println("Ingrese numeros (un numero negativo para terminar):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }
            if (numero == numeroAnterior) {
                repetidoConsecutivo = true;
            }
            numeroAnterior = numero;
        }
        if (repetidoConsecutivo) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
