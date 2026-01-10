package Ejercicios5;

import java.util.Scanner;

public class Ejer6 {
    /*
     Crea un programa que descubra si una palabra es o no palíndroma, es decir se lee igual del derecho que del revés.

Introduciendo: “oso”
Da como salida: true
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        String invertida = new StringBuilder(palabra).reverse().toString();
        boolean esPalindroma = palabra.equalsIgnoreCase(invertida);

        System.out.println(esPalindroma);

    }

}