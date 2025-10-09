package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una velocidad en Km/h y la pasare a m/s ");

        int km = scanner.nextInt();

        double division = km / 3.6;

        System.out.println("Tu velocidad seria : " + division + " m/s" );


    }
}
