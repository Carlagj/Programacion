package Tema5.ejercicios4.Ejer5;

import java.util.HashSet;
import java.util.Set;

public class Ejer5 {
    /*
    Ejercicio 5: Detector de Errores (Validación de add)

El metodo add() devuelve un valor booleano que indica si el elemento se añadió con éxito o no.

Tarea: Crea un Set<String> para matrículas de coches.

Acción: Intenta añadir dos veces la misma matrícula.
Lógica: Si el metodo add() devuelve false, muestra un mensaje por pantalla:
"ERROR: La matrícula ya existe en el sistema"
     */
    public static void main(String[] args) {


        Set<String> matriculas = new HashSet<>();

        matriculas.add("1234JKL");
        matriculas.add("4321JGH");
        matriculas.add("5677GHL");

        System.out.println(matriculas);
        System.out.println("Añade la matricula 1234JKL ");

        boolean introducido = matriculas.add("1234JKL");
        if (!introducido) {
            System.out.println("Error la matricula ya existe en el sistema");
        }

    }
}
