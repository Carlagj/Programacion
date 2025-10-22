package T2Ejrs2;

import java.util.Scanner;

public class Funciones_3 {
    /*
    implementa un metodo que reciba un nombre y edad y muestre un mensaje personalizado.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("escribe tu edad");
        int edad = scanner.nextInt();

        scanner.close();
        mensajeAlUsuario(nombre, edad);
    }

    static void mensajeAlUsuario(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }

}
