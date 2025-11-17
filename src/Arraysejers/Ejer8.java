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

       /* int[][] prueba = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };*/

        //System.out.println(Arrays.toString(magico));


        for (int[] magia : magico) {
            System.out.println(Arrays.toString(magia));
        }

        System.out.println("magico -> " + esCuadroMagico(magico));       // debería imprimir true

    }

    public static boolean esCuadroMagico(int[][] m) {
        // Validaciones básicas
        if (m == null) return false;
        int n = m.length;
        if (n != 5) return false;                 // petición: 5x5. Si quieres generalizar, quita esta línea.
        for (int i = 0; i < n; i++) {
            if (m[i] == null || m[i].length != n) return false; // no es cuadrada -> false
        }

        // 1) Calcular la suma objetivo: la suma de la primera fila (podría ser cualquier fila/col)
        int sumaObjetivo = 0;
        for (int j = 0; j < n; j++) sumaObjetivo += m[0][j];

        // 2) Comprobar todas las filas
        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) sumaFila += m[i][j];
            if (sumaFila != sumaObjetivo) return false;
        }

        // 3) Comprobar todas las columnas
        for (int j = 0; j < n; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) sumaCol += m[i][j];
            if (sumaCol != sumaObjetivo) return false;
        }

        // 4) Comprobar la diagonal principal (de arriba-izquierda a abajo-derecha)
        int sumaDiag1 = 0;
        for (int i = 0; i < n; i++) sumaDiag1 += m[i][i];
        if (sumaDiag1 != sumaObjetivo) return false;

        // 5) Comprobar la diagonal secundaria (de arriba-derecha a abajo-izquierda)
        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) sumaDiag2 += m[i][n - 1 - i];
        if (sumaDiag2 != sumaObjetivo) return false;
        // Si llegamos hasta aquí, cumple todas las condiciones
        return true;


    }
}