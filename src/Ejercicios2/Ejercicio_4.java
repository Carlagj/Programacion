package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero");

        int numero = scanner.nextInt();

        int resultado1, resultado2;
        resultado1 = numero * 2;
        resultado2 = numero * 3;

        System.out.println("El doble de tu numero es " + resultado1  );
        System.out.println("El triple de tu numero es " + resultado2);
    }
}
