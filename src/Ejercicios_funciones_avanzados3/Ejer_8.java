package Ejercicios_funciones_avanzados3;

public class Ejer_8 {
    /*
    Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
    Estos métodos reciben un String y retornan ese String ya cifrado o descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que está dos puestos mas adelante( la a se cambia por la c), teniendo en cuenta que el cambio es circular, es decir, la z se cambiará por la b. El proceso de descifrado es el contrario.
    Los caracteres que no sean alfabéticos no registrarán ningún cambio.
     */
    public static void main(String[] args) {

        String cadena = "hola";
        char caracter = cadena.charAt(0);
        System.out.println(caracter);
        System.out.println(caracter + 2);
        System.out.println((char) (caracter + 2));

        String nuevaCadena = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            c += 2;
            nuevaCadena = nuevaCadena + c;
        }
        System.out.println(nuevaCadena);
    }
}

