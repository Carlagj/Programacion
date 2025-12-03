package Arraysejers;

import java.util.Arrays;

public class Ejer8 {
    public static void main(String[] args) {
        /*
        Comprobar si un array de 5x5 es un cuadro mágico.
        Se considera un cuadro mágico aquel en el que las filas,
        las columnas y las diagonales suman igual.
         */


        // Crear cuadrado
        int[][] magico = {
                {15, 8, 1, 24, 17},
                {16, 14, 7, 5, 23},
                {22, 20, 13, 6, 4},
                {3, 21, 19, 12, 10},
                {9, 2, 25, 18, 11}
        };


        for (int[] magia : magico) {
            System.out.println(Arrays.toString(magia));
        }

        System.out.println("magico -> " + esCuadroMagico(magico));

    }

    public static boolean esCuadroMagico(int[][] m) {
        // Validaciones básicas
        if (m == null) return false;
        int n = m.length;
        if (n != 5) return false;
        for (int i = 0; i < n; i++) {
            if (m[i] == null || m[i].length != n) return false; // no es cuadrada -> false
        }

        int sumaObjetivo = 0;
        for (int j = 0; j < n; j++) sumaObjetivo += m[0][j];

        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) sumaFila += m[i][j];
            if (sumaFila != sumaObjetivo) return false;
        }

        for (int j = 0; j < n; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) sumaCol += m[i][j];
            if (sumaCol != sumaObjetivo) return false;
        }

        int sumaDiag1 = 0;
        for (int i = 0; i < n; i++) sumaDiag1 += m[i][i];
        if (sumaDiag1 != sumaObjetivo) return false;


        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) sumaDiag2 += m[i][n - 1 - i];
        if (sumaDiag2 != sumaObjetivo) return false;

        return true;


    }
}