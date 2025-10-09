package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero de tres cifras");
        int num = scanner.nextInt();

        System.out.println((num/100) + " " + (num/10%10) + " " + (num%10));

        scanner.close();

    }
}
