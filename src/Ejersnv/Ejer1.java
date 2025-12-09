package Ejersnv;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String palabra = sc.nextLine();


        boolean contieneA = palabra.toLowerCase().contains("a");

        System.out.println("Longitud: " + palabra.length());
        System.out.println("Primer carácter: " + palabra.charAt(0));
        System.out.println("Último carácter: " + palabra.charAt((palabra.length() - 1)));
        System.out.println("¿Contiene la letra 'a'? " + (contieneA ? "Sí" : "No"));

        sc.close();
    }
}
