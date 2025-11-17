package Arraysejers;

import java.util.Arrays;
import java.util.Random;

public class Ejer5 {
    public static void main(String[] args) {
        /*
        Dado un array de 50 números entre 1 y 100, aleatorios,
        escribir una lista ordenada con los valores que no aparecen en el array.
         */

        int[] arr = new int[50];
        Random rand = new Random();

        // Llenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Numeros aleatorios:");

        for (int[] Aray : new int[][]{arr}) {
            System.out.println(Arrays.toString(Aray));
        }


        // Array para marcar si aparece cada número del 1 al 100
        boolean[] aparece = new boolean[101]; // índice 0 no se usa

        // Marcar cada número que aparece
        for (int num : arr) {
            aparece[num] = true;
        }

        // Mostrar los números faltantes
        System.out.println("Números que NO aparecen:");

        for (int i = 1; i <= 100; i++) {
            if (!aparece[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
