package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero entero");
        int numero = scanner.nextInt();

        System.out.println((numero %2 ==0 ) ? "Par" : "Impar");

        scanner.close();
    }
}
