package T2Ejercicios1.ejers3;

import java.util.Scanner;

public class Ejer_2 {

    //Define un metodo sumar que reciba dos enteros y retorne su suma.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el primer numero de la suma:");
        int a = scanner.nextInt();
        System.out.println("Escribe el segundo numero de la suma:");
        int b = scanner.nextInt();

        scanner.close();


        int resultado = sumar(a, b);
        System.out.println("La suma es: " + resultado);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

}
