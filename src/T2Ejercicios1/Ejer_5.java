package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // comprobacion

        if (edad >= 18) {
            System.out.println("Tienes " + edad + " años. Puedes votar.");
        } else if (edad > 0) {
            System.out.println("Tienes " + edad + " años. No Puedes votar todavia.");
        }else {
            System.out.println("Edad No valida. Debe ser numero positivo.");
        }
        scanner.close();
    }
}
