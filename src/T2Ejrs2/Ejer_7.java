package T2Ejrs2;

import java.util.Scanner;

public class Ejer_7 {

    /*Pide por teclado dos números y genera 10 números aleatorios entre esos números.
    Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
    */

    static void main() {
        Scanner scanner = new Scanner(System.in);

        //pedimos los limites

        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();

        // CUal es el menor y cual e mayor
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        System.out.println("10 numeros aleatorios entre " + min + " y " + max + " : ");

        int contador = 0;

        while (contador < 10) {
            int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(aleatorio);
            contador++;
        }
        scanner.close();
    }
}
