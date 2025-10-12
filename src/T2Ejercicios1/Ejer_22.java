package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_22 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int numeroAnterior  = Integer.MIN_VALUE;
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
        }else {
            System.out.println("No");
        }
        scanner.close();
    }
}
