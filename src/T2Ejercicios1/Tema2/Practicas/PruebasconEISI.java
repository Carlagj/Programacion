package T2Ejercicios1.Tema2.Practicas;

import java.util.Scanner;

public class PruebasconEISI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            if (edad >= 65) {
                System.out.println("Estas jubilado");
            } else {
                System.out.println("Eres un trabajador");
            }
        } else {
            System.out.println("Eres menor de edad");
        }

    }
}
