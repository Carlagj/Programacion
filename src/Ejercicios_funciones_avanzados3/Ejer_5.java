package Ejercicios_funciones_avanzados3;

import java.util.Scanner;

public class Ejer_5 {
    /*
    Metodo factorial(), que calculará el factorial del número que se le pasa como parámetro.
    Retornará el resultado del cálculo del factorial, o bien un -1 en caso de que el parámetro pasado sea negativo,
    y un -2 en caso de que el parámetro pasado sea cero.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número: ");
        int n = sc.nextInt();
        System.out.println("Resultado: " + factorial(n));
    }

    static int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0) return -2;
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }


}
