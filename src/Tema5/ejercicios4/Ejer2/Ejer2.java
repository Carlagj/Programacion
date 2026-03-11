package Tema5.ejercicios4.Ejer2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejer2 {
    /*
    Ejercicio 2: ¿Estás en la lista? (Uso de contains)

Practicar la búsqueda rápida de elementos, una de las mayores ventajas de los conjuntos.

Tarea: Crea un HashSet<Integer> con una lista de 5 números de identificación (IDs) fijos.

Acción: Pide al usuario por teclado un número usando Scanner.

Salida: Indica mediante un boolean si ese ID tiene acceso (si está contenido en el Set) o no.
     */
    public static void main(String[] args) {

        Set<Integer> ids = new HashSet<>();

        ids.add(12423);
        ids.add(12323);
        ids.add(23623);
        ids.add(20045);
        ids.add(30112);


        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu ID: ");

        int IdUsuario = sc.nextInt();


        boolean tieneAceso = ids.contains(IdUsuario);
        System.out.println("Tiene acceso:  " + tieneAceso);


    }

}
