package Tema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer2 {
    /*
    Utilizando la lista del ejercicio anterior:

Pide un nombre por teclado y comprueba si el alumno existe en la lista.

Si existe, modifica su nombre para que aparezca tod en mayusculas.

Muestra la lista completa utilizando un bucle for-each.
     */

    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>();
        alumnos.add("Carla");
        alumnos.add("Gabriel");
        alumnos.add("Esteban");
        alumnos.add("Rafa");
        alumnos.add("Daniel");


        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre que quieras comprobar");

        String nombre = sc.nextLine();

        if (alumnos.contains(nombre)) {
            int indice = alumnos.indexOf(nombre);
            alumnos.set(indice, nombre.toUpperCase());
            System.out.println("Alumno encontrado");
        } else {
            System.out.println("El alumno no esta en la lista");


        }


        for (String alumno : alumnos) {
            System.out.println(" - " + alumno);
        }


        sc.close();


    }


}
