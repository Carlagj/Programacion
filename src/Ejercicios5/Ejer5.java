package Ejercicios5;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Ejer5 {
    /*
     Escribe un programa que lea un número en coma flotante de doble precisión,
     lo convierta a una cadena y le añada las comas separadoras de los miles.
Introduciendo: 2388432.34
Da como salida: 2,388,432.34
     */

    public static void main(String[] args) {

        double numero = 3288432.34;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formato = new DecimalFormat("#,###.##", symbols);
        String resultado = formato.format(numero);

        System.out.println("Salida: " + resultado);


    }
}
