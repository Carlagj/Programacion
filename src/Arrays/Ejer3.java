package Arrays;

import java.util.Random;

public class Ejer3 {
    public static void main(String[] args) {
        int[] ArayR = new int[20];
        Random r = new Random();

        for (int i = 0; i < ArayR.length; i++) {

            ArayR[i] = r.nextInt(10);
        }
        System.out.print("Array: ");
        for (int num : ArayR) {
            System.out.print(num + " ");

        }
        System.out.println();

        if (estaOrdenado(ArayR)) {
            System.out.println("El array esta ordenado de forma ascendente");
        } else {
            System.out.println("El array no esta ordenado de forma ascendente");
        }

    }

    private static boolean estaOrdenado(int[] arayR) {
        for (int i = 0; i < arayR.length - 1; i++) {
            if (arayR[i] > arayR[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
