package T2Ejrs2;

import java.util.Scanner;

public class Ejer_11 {
    /*
    Programa un juego que genere un número aleatorio y te permita introducir números hasta que des con el adecuado.
    El juego deberá indicarte si el número introducido es mayor o menor.
     */

    static void main() {

        Scanner scanner = new Scanner(System.in);

        // Generar un numero aleatorio entre 1 y 100
        int numeroS = (int)  (Math.random() * 100) + 1;
        int intento = 0;

        System.out.println("¡Adivina el numero secreto entre 1 y 100!");

        //Bucle hasta que el jugador acierte

        do {
            System.out.print("Introduce tu numero:");
            intento = scanner.nextInt();

            if (intento < numeroS) {
                System.out.println("El numero es mayor.");
            } else if (intento > numeroS) {
                System.out.println("El numero es menor.");
            }else {
                System.out.println("¡Felicidades!  ¡Has adivinado el numero! :)");
            }
        } while (intento != numeroS);
        scanner.close();
    }
}
