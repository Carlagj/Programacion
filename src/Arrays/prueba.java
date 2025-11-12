package Arrays;

import java.util.Arrays;

public class prueba {
    public static void main(String[] args) {
        int[] datos1 = {1, 2, 3};
        int[] datos2 = {4, 5, 6};

        // System.out.println(Arrays.toString(datos1));
        //System.out.println(Arrays.toString(datos2));

        int[][] numeros = {datos1, datos2};

        for (int[] numero : numeros) {
            System.out.println(Arrays.toString(numero));
        }
    }
}
