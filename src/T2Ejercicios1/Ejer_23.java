package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_23 {
    static void main() {

        /*
        Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.
        Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
        Da como salida: 33
         */

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
