package tema6.ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    /*
    Ejercicio 2: El Diario de Clase (Escritura de Texto Plano)
Objetivo: Practicar la escritura de texto añadiendo contenido al final del archivo (append).

Tarea: Crea un programa que funcione como un diario. Debe pedir al usuario por consola que introduzca frases.

Acción: 1. Cada frase introducida se debe guardar en un archivo llamado diario.txt.
2. El programa debe seguir pidiendo frases hasta que el usuario escriba la palabra "FIN".
3. Asegúrate de que si ejecutas el programa dos veces,
las frases nuevas se añadan debajo de las antiguas sin borrar las anteriores (modo append).
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        try {

            FileWriter fw = new FileWriter("diario.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            String frase = "";

            while (!frase.equalsIgnoreCase("FIN")) {
                System.out.println("Escribe una frase (o 'FIN' para terminar):");
                frase = sc.nextLine();
                if (!frase.equalsIgnoreCase("FIN")) {
                    bw.write(frase);
                    bw.newLine();
                }
            }

            bw.close();
            System.out.println("Guardado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }

        sc.close();
    }
}
