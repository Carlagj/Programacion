package T2Ejercicios1.Tema2.Practicas;

import java.util.Scanner;

public class Ejercocacola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el dinero que tengas");

        double dinero = scanner.nextDouble();

        if (dinero >= 7) {
            System.out.println("tienes para cocacola y bocadillo");

        } else if (dinero >= 5) {
            System.out.println("Tienes para agua y bocadillo");
        } else if (dinero >= 2) {
            System.out.println("Tienes para cocacola");
        } else {
            System.out.println("Tienes para agua");
        }
        scanner.close();
    }
}