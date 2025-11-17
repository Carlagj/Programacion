package Arraysejers;

import java.util.Arrays;

public class Ejer9 {
    public static void main(String[] args) {
        /*
        Crea un programa que mezcle dos arrays ordenados de N elementos,
        consiguiendo otro array de N*2 elementos igualmente ordenados.
         */

        int[] A = {4, 8, 15, 22, 25, 40};
        int[] B = {3, 6, 18, 21, 25, 47};

        int N = A.length;
        int[] C = new int[N * 2];

        int i = 0, j = 0, k = 0;

        System.out.println("Array A:");

        for (int[] A1 : new int[][]{A}) {
            System.out.println(Arrays.toString(A1));
        }

        System.out.println("Array B:");

        for (int[] B1 : new int[][]{B}) {
            System.out.println(Arrays.toString(B1));
        }

        // Mezcla ordenada (merge)
        while (i < N && j < N) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // Copiar los elementos restantes de A
        while (i < N) {
            C[k++] = A[i++];
        }

        // Copiar los elementos restantes de B
        while (j < N) {
            C[k++] = B[j++];
        }

        // Imprimir el array C resultado
        System.out.println("Array C: ");
        for (int x = 0; x < C.length; x++) {
            System.out.print(C[x] + " ");
        }

    }
}
