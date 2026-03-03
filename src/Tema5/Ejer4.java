package Tema5;

import java.util.ArrayList;
import java.util.List;

public class Ejer4 {
    /*
    Dado el siguiente array de notas: int[] notasArray = {4, 9, 7, 5, 10};

Crea un ArrayList de objetos Integer.

Vuelca todos los datos del array a la lista utilizando un bucle.

Muestra la lista final formateada como un String.
     */


    public static void main(String[] args) {

        int[] notasArray = {4, 9, 7, 5, 10};
        List<Integer> listaNotas = new ArrayList<>();

        for (int nota : notasArray) {
            listaNotas.add(nota);
        }

        System.out.println("Listado de notas: " + listaNotas.toString());

    }
}
