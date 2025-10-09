package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia ");

        double radio = scanner.nextDouble();

        double longitud, area;
        longitud = 2 * Math.PI * radio;
        area = Math.PI * radio * radio;

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Area de la circunferencia: " + area);
    }
}
