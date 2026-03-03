package Tema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejer3 {
    /*
    Crea una lista de números enteros (Integer).

Rellena la lista con 10 números aleatorios entre 1 y 50.

Calcula la suma de todos los números de la lista recorriéndola con un bucle for clásico.

Muestra el número mayor encontrado en la lista.
     */


    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(rand.nextInt(50) + 1);
        }


        int suma = 0;
        int mayor = numeros.get(0);

        //SUMA
        for (int i = 0; i < numeros.size(); i++) {
            int numActual = numeros.get(i);
            suma += numActual;

            // Numero mayor
            if (numActual > mayor) {
                mayor = numActual;
            }
        }

        System.out.println(numeros);
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El numero mayor es: " + mayor);

    }

}
