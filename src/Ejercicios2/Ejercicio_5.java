package Ejercicios2;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta tu Direccion ");

        String Direccion = scanner.nextLine();
        System.out.println("Inserta tu numero de Telefono");
        int Telefono = scanner.nextInt() ;

        System.out.println("Tu Direccion es: "  + Direccion);
        System.out.println("Tu numero de Telefono es: " + Telefono);


    }
}
