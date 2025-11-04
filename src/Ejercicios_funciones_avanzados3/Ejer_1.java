package Ejercicios_funciones_avanzados3;

import java.util.Scanner;

public class Ejer_1 {

    //Implementa un metodo recursivo que determine si un número es primo

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero para saber si es primo");
        int num = scanner.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }

        scanner.close();
    }

    private static boolean esPrimo(int num) {
        return esPrimoRec(num, 2);
    }

    private static boolean esPrimoRec(int num, int divisor) {
        if (num <= 1) {
            return false;
        }
        if (divisor == num) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return esPrimoRec(num, divisor + 1);
    }
}
