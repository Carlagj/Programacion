package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int num = scanner.nextInt();

        System.out.println((num %10== 0 )? "Es multiplo de 10" : "No es multiplo de 10");

        scanner.close();
    }

}
