package Ejercicios5;

public class Ejer4 {
    /*
    Desarrolla un programa que rote una cadena tantas veces como se le indique.
Introduciendo: “Lunes”
Rotaciones: 3
Da como salida: “nesLu”
     */
    public static void main(String[] args) {

                String texto = "Lunes";
                int rotaciones = 3;

                rotaciones = rotaciones % texto.length();


                String resultado = texto.substring(texto.length() - rotaciones)
                        + texto.substring(0, texto.length() - rotaciones);

                System.out.println("Salida: " + resultado);




    }
}
