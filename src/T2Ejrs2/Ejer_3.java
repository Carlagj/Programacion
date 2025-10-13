package T2Ejrs2;

import java.util.Scanner;

public class Ejer_3 {

    //Crea un programa en el que introduzcas una nota del 1 al 10 y te indique su nota en formato escrito (insuficiente, suficiente, etc).

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce una nota del 1 al 10: ");
        int nota = scanner.nextInt();

        String calificacion;

        if (nota < 0 || nota > 10) {
            calificacion = "Nota fuera de rango. Debe estar entre 1 y 10";
        } else if (nota < 5) {
            calificacion = "insuficiente";
        } else if (nota == 5) {
            calificacion = "suficiente";
        } else if (nota == 6) {
            calificacion = "Bien";
        } else if (nota == 7 || nota == 8) {
            calificacion = "Notable";
        } else { // 9 o 10
            calificacion = "Sobresaliente";
        }
        System.out.println("Tu calificacion es un: " + calificacion);
        scanner.close();

    }
}