package Tema5;

import java.util.ArrayList;
import java.util.List;

public class Ejer1 {
    /*
    Crea un programa que gestione una lista de nombres de alumnos (String) utilizando un ArrayList.

Añade cinco nombres a la lista.

Inserta un nombre nuevo en la tercera posición (índice 2).

Muestra el tamaño actual de la lista utilizando el atributo o metodo correspondiente.

Elimina al alumno que esté en la última posición.
     */
    public static void main(String[] args) {


        List<String> alumnos = new ArrayList<>();

        alumnos.add("Carla");
        alumnos.add("Gabriel");
        alumnos.add("Esteban");
        alumnos.add("Rafa");
        alumnos.add("Daniel");


        System.out.println(alumnos);

        alumnos.add(2, "Natalia");

        System.out.println(alumnos);
        System.out.println(alumnos.size());


        alumnos.remove(alumnos.size() - 1);

        System.out.println(alumnos);


    }
}
