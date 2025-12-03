package Repaso;

public class Ejer3 {
    public static void main(String[] args) {
        int[] notas = {4, 9, 7, 5, 10};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota " + i + " es " + notas[i]);
        }


        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double media = suma / (double) notas.length;
        System.out.println("Media: " + media);
    }
}
