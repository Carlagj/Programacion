package Explicaciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = sc.nextInt();
        int veces = 0;

        int[] arrayRamdom = new int[20];
        Random r = new Random();
        for (int i = 0; i < arrayRamdom.length; i++) {
            arrayRamdom[i] = r.nextInt(10);
            if (arrayRamdom[i] == numero) {
                veces += 1;
            }
        }
        System.out.println(Arrays.toString(arrayRamdom));
        System.out.println("El numero aparece " + veces + " veces");
        sc.close();


    }


}
