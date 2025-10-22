package T2Ejrs2;

import java.util.Scanner;

public class Ejer_1inverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la altura del triangulo: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = altura - 1; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
