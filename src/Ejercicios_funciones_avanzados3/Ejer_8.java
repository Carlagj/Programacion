package Ejercicios_funciones_avanzados3;

import java.util.Scanner;

public class Ejer_8 {
    /*
    Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
    Estos métodos reciben un String y retornan ese String ya cifrado o descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos mas adelante( la a se cambia por la c), teniendo en cuenta que el cambio es circular, es decir, la z se cambiará por la b. El proceso de descifrado es el contrario.
    Los caracteres que no sean alfabéticos no registrarán ningún cambio.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String cifrada = cifrar(cadena);
        System.out.println("Cifrada: " + cifrada);

        String descifrada = descifrar(cifrada);
        System.out.println("Descifrada: " + descifrada);
    }

    public static String cifrar(String cadena) {
        String nuevaCadena = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            // Si es minúscula
            if (c >= 'a' && c <= 'z') {
                c += 2;
                if (c > 'z') { // Si pasa del final vuelve al inicio
                    c -= 26;
                }
            }
            // Si es mayúscula
            else if (c >= 'A' && c <= 'Z') {
                c += 2;
                if (c > 'Z') {
                    c -= 26;
                }
            }
            // Otros caracteres no cambian

            nuevaCadena = nuevaCadena + c; // MISMO ESTILO QUE PEDISTE
        }

        return nuevaCadena;
    }

    public static String descifrar(String cadena) {
        String nuevaCadena = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            // Minúsculas
            if (c >= 'a' && c <= 'z') {
                c -= 2;
                if (c < 'a') { // Si pasa por debajo vuelve a z
                    c += 26;
                }
            }
            // Mayúsculas
            else if (c >= 'A' && c <= 'Z') {
                c -= 2;
                if (c < 'A') {
                    c += 26;
                }
            }

            nuevaCadena = nuevaCadena + c; // MISMO ESTILO
        }

        return nuevaCadena;


    }
}

