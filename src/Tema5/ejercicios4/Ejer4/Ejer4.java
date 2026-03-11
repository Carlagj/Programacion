package Tema5.ejercicios4.Ejer4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejer4 {
    /*
   Ejercicio 4: Limpieza de una Lista (Conversión)

Aprender a "limpiar" duplicados de una lista de forma eficiente.

Tarea: Crea un ArrayList<String> con los colores: "Rojo", "Azul", "Rojo", "Verde", "Azul".

Acción: Pasa todos los elementos del ArrayList a un HashSet (puedes usar el constructor del Set o un bucle).

Salida: Muestra la nueva colección sin colores repetidos.
     */
    public static void main(String[] args) {


        List<String> colores = new ArrayList<>();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");


        Set<String> coloreslimpios = new HashSet<>(colores);

        System.out.println(colores);
        System.out.println(coloreslimpios);


    }

}
