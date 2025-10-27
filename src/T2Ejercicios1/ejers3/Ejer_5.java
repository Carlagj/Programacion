package T2Ejercicios1.ejers3;

import java.util.Scanner;

public class Ejer_5 {

// Metodo para determinar si un número es par o impar

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("escriba un numero entero para saber si es par o impar");
        int num = scanner.nextInt();

        if (esPar(num)) {
            System.out.println(num + " Es par.");
        } else {
            System.out.println(num + " Es impar.");
        }
    }

    private static boolean esPar(int num) {
        return num % 2 == 0;
    }
}
