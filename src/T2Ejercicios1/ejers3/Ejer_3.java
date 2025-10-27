package T2Ejercicios1.ejers3;

import java.util.Scanner;

public class Ejer_3 {
    // Metodo que reciba un nombre y edad y muestre un mensaje personalizado

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Escribe tu edad: ");
        int edad = scanner.nextInt();

        mostrarMensaje
                (nombre, edad);
        scanner.close();
    }

    private static void mostrarMensaje(String nombre, int edad) {
        System.out.println("Hola " + nombre + " tienes " + edad + " años. ");
    }


}
