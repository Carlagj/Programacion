package Tema3.ejerrepaso;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Alumno[] clase = new Alumno[3];
        for (int i = 0; i < clase.length; i++) {
            System.out.println("Escribe tu nombre");
            String n = sc.next();
            System.out.println("escribe tu nota");
            double nota = sc.nextDouble();
            clase[i] = new Alumno(n, nota);

            if (nota < 5) {
                System.out.println("¿Le quieres aprobar?");
                String s1 = sc.next();
                if ("s".equals(s1)) {
                    clase[i].aprobar();
                } else {
                    System.out.println("Pues se queda suspenso");
                }

            }
        }
        System.out.println("imprimir todo el array");
        System.out.println(Arrays.toString(clase));
        sc.close();
    }
}
