package Explicaciones;

import java.util.Scanner;

public class automatizar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor");
        String nombre = scanner.nextLine();
        System.out.println("Hola" + nombre);
        System.out.println("¿Cuantos años tienes?");
        int edad = scanner.nextInt();
        System.out.println(nombre + " tiene " + edad + " Años");

    }
}
