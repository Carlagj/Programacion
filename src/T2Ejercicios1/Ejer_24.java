package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_24 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero entre 0 y 9999: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("Numero fuera de rango.");
        }else {
            int original = numero;
            int invertido = 0;

            while (numero >0){
                int digito = numero % 10;
                invertido = invertido *10 + digito;
                numero = numero / 10;
            }

            if (original == invertido) {
                System.out.println("El numero " + numero + " es capicua.");
            }else {
                System.out.println("El numero " + numero + " no es capicua ");
            }
        }
        scanner.close();
    }
}
