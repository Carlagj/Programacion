package Ejercicios5;

import java.util.Scanner;

public class Ejer16 {
    /*
      Realiza un programa que compruebe si en una palabra se repite alguna vocal más de 2 veces.
      El programa pedirá que se teclee una palabra y comprobará las vocales que contiene,
      cuando compruebe que una vocal aparece más de dos veces emitirá un mensaje en la pantalla y terminará.
      El programa debe terminar en el mismo instante en que encuentre más de dos vocales iguales,
      no esperará a comprobar toda la palabra (prohibido usar break).

Ejemplo: Escriba una palabra: “Instintivo”
Dará como resultado: “Tiene mas de dos vocales iguales”
     */
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Escriba una palabra: ");
                String palabra = sc.nextLine().toLowerCase();

                int a=0, e=0, i=0, o=0, u=0;
                int indice = 0;

                // El bucle continúa solo mientras ninguna vocal tenga más de 2 apariciones
                while (indice < palabra.length() &&
                        a < 3 && e < 3 && i < 3 && o < 3 && u < 3) {

                    char c = palabra.charAt(indice);

                    if (c == 'a') a++;
                    else if (c == 'e') e++;
                    else if (c == 'i') i++;
                    else if (c == 'o') o++;
                    else if (c == 'u') u++;

                    indice++;
                }

                // Si se salió porque alguna vocal superó 2
                if (a >= 3 || e >= 3 || i >= 3 || o >= 3 || u >= 3) {
                    System.out.println("Tiene mas de dos vocales iguales");
                } else {
                    System.out.println("No tiene mas de dos vocales iguales");
                }
        sc.close();
    }
}
