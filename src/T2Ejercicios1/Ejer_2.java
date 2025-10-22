package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_2 {
    public static void main(String[] args) {

        // Calcular el mayor de tres números enteros.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int num1 = scanner.nextInt();

        System.out.println("Escribe el segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("Escribe el tercer numero");
        int num3 = scanner.nextInt();

        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor de los tres numeros es: " + mayor);

        scanner.close();
    }
}
