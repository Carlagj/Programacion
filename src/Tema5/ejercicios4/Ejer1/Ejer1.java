package Tema5.ejercicios4.Ejer1;

import java.util.HashSet;
import java.util.Set;

public class Ejer1 {
    /*
    Ejercicio 1: El Control de Acceso Único (HashSet)

El objetivo es entender que un Set no permite duplicados.

Tarea: Crea un HashSet<String> llamado invitados.

Acción: Añade los nombres: "Ana", "Luis", "Ana", "Marta", "Luis".

Salida: Muestra el tamaño de la lista (size()) y comprueba que solo hay 3 nombres en total.
     */

    public static void main(String[] args) {


        Set<String> invitados = new HashSet<>();

        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");


        System.out.println("Tamaño lista " + invitados.size());
        System.out.println("Total nombres" + invitados);

    }
}
