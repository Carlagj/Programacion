package Arrays;

import java.util.Arrays;

public class sindeclarasimplipru {
    public static void main(String[] args) {

      /*  int[] numeros1 = new int[3];
        numeros1[0] = 1;
        numeros1[1] = 2;
        numeros1[2] = 3;

        int[] numeros2 = new int[3];
        numeros2[0] = 4;
        numeros2[1] = 5;
        numeros2[2] = 6;
*/
        //int[numeros1][numeros2] = new int[2][3];

        int[][] numeros = new int[2][3];
        int k = 1;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = k;
                k++;
            }


        }

        for (int[] num : numeros) {
            System.out.println(Arrays.toString(num));
        }


    }
}
