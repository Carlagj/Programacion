package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_21 {
    public static void main(String[] args) {

        //Realiza un programa que permita la entrada de varios números y calcule su media.

        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        double numero;
        char opcion;

        System.out.println("Ingrese numeros para calcular su media.");

        do {
            System.out.print("Ingrese su numero: ");
            numero = scanner.nextDouble();
            suma += numero;
            contador++;

            System.out.print("¿Desea ingresar otro numero? (s/n): ");
            opcion = scanner.next().toLowerCase().charAt(0);

        } while (opcion == 's');

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron numeros.");
        }
        scanner.close();
    }
}
