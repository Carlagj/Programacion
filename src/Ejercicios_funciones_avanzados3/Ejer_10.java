package Ejercicios_funciones_avanzados3;

import java.util.Scanner;

public class Ejer_10 {

    /*
   Haz programa que ordene alfabéticamente las letras de una frase.
   El programa debe pedir por teclado una frase y escribirla con las letras ordenadas.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();
        System.out.println("Ordenada: " + ordenar(frase));
    }

    public static String ordenar(String f) {
        String r = "";
        while (f.length() > 0) {
            char m = obtenerLetraMenor(f);
            r += m;
            f = eliminarLetra(f, m);
        }
        return r;
    }

    public static char obtenerLetraMenor(String f) {
        char menor = f.charAt(0);
        for (char c : f.toCharArray()) if (c < menor) menor = c;
        return menor;
    }

    public static String eliminarLetra(String f, char c) {
        boolean borrado = false;
        String r = "";
        for (char x : f.toCharArray()) {
            if (x == c && !borrado) borrado = true;
            else r += x;
        }
        return r;
    }
}