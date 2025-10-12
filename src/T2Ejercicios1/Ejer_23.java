package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_23 {
    static void main() {
    Scanner scanner = new Scanner(System.in);

    int suma = 0;
    int contadorCeros = 0;

        System.out.println("Ingrese numeros (el programa terminara despues de 5 ceros):");

        while (contadorCeros < 5) {
            int numero = scanner.nextInt();

            if (numero == 0) {
                contadorCeros++;
            } else {
                suma += numero;
            }
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
        scanner.close();

    }
}
