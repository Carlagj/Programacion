package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_15 {
    static void main() {

        //Mostrar la tabla de multiplicar de un número.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
