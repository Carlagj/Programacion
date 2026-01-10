package Ejercicios5;

public class Ejer3 {
    /*
    Implementa un programa que codifique una cadena cambiando cada letra por la siguiente en el código ASCII.
Introduciendo: “Lunes”
Da como salida: “Mvoft”
     */
    public static void main(String[] args) {

      String cadena = "Lunes";
      String resultado = "";

      for (int i = 0; i < cadena.length(); i++) {
          char letra = cadena.charAt(i);
          letra = (char) (letra + 1);
          resultado = resultado + letra;
      }
        System.out.println("palabra inicial: " + cadena);
        System.out.println("resultado: " + resultado);

    }
}
