package Ejercicios5;

import java.util.Scanner;

public class Ejer14 {
    /*
     Implementa un programa que intercale las letras de dos palabras.
   El programa debe pedir 2 palabras y luego dar otra palabra resultado con las letras de las dos palabras intercaladas.

Introduciendo:  Primera palabra “INTERNET”
Segunda palabra “correo”
Da como salida: “IcNoTrErReNoET”
     */
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Introduce la primera palabra: ");
                String p1 = sc.nextLine();

                System.out.print("Introduce la segunda palabra: ");
                String p2 = sc.nextLine();

                StringBuilder resultado = new StringBuilder();

                int maxLen = Math.max(p1.length(), p2.length());

                for (int i = 0; i < maxLen; i++) {

                    if (i < p1.length()) {
                        resultado.append(p1.charAt(i));
                    }

                    if (i < p2.length()) {
                        resultado.append(p2.charAt(i));
                    }
                }

                System.out.println("Resultado: " + resultado.toString());

        sc.close();
    }
}









