package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_14 {
    public static void main(String[] args) {
       /*
       Lee un número por teclado y comprueba que este número es mayor o igual que cero,
       si no lo es lo volverá a pedir (do while),
       después muestra ese número por consola.
        */

        Scanner scanner = new Scanner(System.in);
        int numero;
        // bucle do-while
        do {
            System.out.print("Ingrese el numero mayor o igual a cero: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Numero no valido. intente de nuevo.");
            }
        } while (numero < 0);
        System.out.println("El numero ingresado es: " + numero);

        scanner.close();
    }
}
