package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char  caracter = scanner.nextLine().charAt(0);

        System.out.println((caracter >= 'A' &&caracter <= 'Z'  )? "Es mayuscula " : "No es mayuscula ");

        scanner.close();
    }
}
