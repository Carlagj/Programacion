package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int edad = scanner.nextInt();

        System.out.println((edad >=18 )? "Eres mayor de edad " : "No eres mayor de edad");

        scanner.close();
    }
}
