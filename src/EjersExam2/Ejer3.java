package EjersExam2;

import java.util.Random;
import java.util.Scanner;

public class Ejer3 {
    /*
  Matrices! Crea un programa que tenga varias funciones:
Un main, donde se solicitará al usuario las dimensiones de la matriz.
Generar una matriz aleatoria. Esta función recibirá un entero (la dimensión) y devolverá la matriz (int[][]).
Generar la matriz traspuesta, en esta matriz se intercambian las dimensiones.
Ejemplo:
Matriz original:
12 45 23
67 89 10
Matriz transpuesta:
12 67
45 89
23 10
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de filas: ");
        int filas = sc.nextInt();

        System.out.println("Introduce el numero de Columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = generaMatrizAleatoria(filas, columnas);

        System.out.println("Matriz original: ");
        imprimirMatriz(matriz);

        int[][] Transpuesta = generarTranspuesta(matriz);
        System.out.println("Matriz transpuesta:");
        imprimirMatriz(Transpuesta);

        sc.close();

    }


    static int[][] generaMatrizAleatoria(int filas, int columnas) {
        Random rand = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }
        return matriz;
    }

    static int[][] generarTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] Transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Transpuesta[j][i] = matriz[i][j];
            }
        }
        return Transpuesta;
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }


    }

}
