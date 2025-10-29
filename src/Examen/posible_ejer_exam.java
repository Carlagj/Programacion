package Examen;

import java.util.Scanner;

public class posible_ejer_exam {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu edad ");
        int edad = scanner.nextInt();
        System.out.println("¿Has tenido accidentes?");
        boolean accidentes = scanner.nextBoolean();

        float precioInicial = 500f;

        scanner.close();

        double total = operacion(precioInicial, edad, accidentes);

        System.out.println("Este seria el precio a pagar " + total + "€");

    }

    static double operacion(float precioInicial, int edad, boolean accidentes) {

        if (edad > 18 && edad < 25) {
            return precioInicial * 1.2;

        } else if (edad > 35 && edad < 55 && !accidentes) {
            return precioInicial * 0.9;

        } else if (edad > 65 && !accidentes) {
            return precioInicial * 1.1;

        } else if (edad > 65 && !accidentes) {
            return precioInicial * 1.3;
        }

        return 0;

    }


}
