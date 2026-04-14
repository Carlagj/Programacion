package tema6.ejercicios;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    /*
Ejercicio 1: El Explorador de Archivos (clase File o Files)
Objetivo: Comprender la navegación por el sistema de ficheros,
la creación de directorios y la comprobación de existencia.

Tarea: Crea un programa que al iniciarse genere una carpeta llamada MiDirectorioDAM en la raíz del proyecto.

Acción: 1. Comprueba si la carpeta ya existe. Si no existe, créala. 2. Dentro de esa carpeta, crea dos archivos vacíos:
datos.txt y config.ini. 3. Lista por consola el contenido de MiDirectorioDAM,
mostrando el nombre de cada archivo y su tamaño en bytes.
     */
    public static void main(String[] args) {

        File carpeta = new File("MiDirectorioDAM");

        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        try {
            File f1 = new File(carpeta, "datos.txt");
            File f2 = new File(carpeta, "config.ini");
            f1.createNewFile();
            f2.createNewFile();
            File[] archivos = carpeta.listFiles();
            for (File f : archivos) {
                System.out.println(f.getName() + " - " + f.length() + " bytes");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
