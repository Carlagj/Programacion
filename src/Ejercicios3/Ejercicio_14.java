package Ejercicios3;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad a retirar: ");

        int cantidad = scanner.nextInt();

        int B500 = cantidad / 500;
        cantidad = cantidad % 500;

        int B200 = cantidad / 200;
        cantidad = cantidad % 200;

        int B100 = cantidad / 100;
        cantidad = cantidad % 100;

        int B50 = cantidad / 50;
        cantidad = cantidad % 50;

        int B20 = cantidad / 20;
        cantidad = cantidad % 20;

        int B10 = cantidad / 10;
        cantidad = cantidad % 10;

        int B5 = cantidad / 5;
        cantidad = cantidad % 5;

        System.out.println(B500 + " Billetes de 500€");
        System.out.println(B200 + " Billetes de 200€");
        System.out.println(B100 + " Billetes de 100€");
        System.out.println(B50 + " Billetes de 50€");
        System.out.println(B20 + " Billetes de 20€");
        System.out.println(B10 + " Billetes de 10€");
        System.out.println(B5 + " Billetes de 5€");
    }


}
