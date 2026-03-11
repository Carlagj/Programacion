package Tema5.ejercicios4.Ejer3;

import java.util.Set;
import java.util.TreeSet;

public class Ejer3 {
    /*
    Ejercicio 3: Ordenación de Premios (TreeSet)

Entender la diferencia entre un saco desordenado (HashSet) y uno que ordena automáticamente (TreeSet).

Tarea: Crea un TreeSet<Integer> para guardar los números premiados de una rifa.

Acción: Añade los números: 45, 12, 89, 3, 22.

Salida: Recorre el conjunto con un bucle for-each y observa cómo Java los muestra ordenados de menor a mayor sin haber hecho nada extra.
     */
    public static void main(String[] args) {

        Set<Integer> premiados = new TreeSet<>();

        premiados.add(45);
        premiados.add(12);
        premiados.add(89);
        premiados.add(3);
        premiados.add(22);


        System.out.println("Premiados Rifa: ");
        for (Integer num : premiados) {
            System.out.println("=" + num);
        }
    }
}
