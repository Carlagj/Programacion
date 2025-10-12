package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_20 {

        /*
 Escribir un programa en Java que lea un número entero desde teclado
 y realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla.
        */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero");

        int numero1 = scanner.nextInt();

        int suma = 0;

        for (int i = numero1; i < numero1 + 100; i++) {

            suma += i;
            System.out.println("sumamos " + i);
        }
        System.out.println("el total es: " + suma);

        scanner.close();
    }
}
