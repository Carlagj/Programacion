package Explicaciones;

import java.util.Arrays;

public class pruebaArrays {
    private static Object notasCarla;

    public static void main(String[] args) {
        int[] notasCarla = new int[3];
        notasCarla = new int[3];
        notasCarla[0] = 5;
        notasCarla[1] = 10;
        notasCarla[2] = 10;

        System.out.println(Arrays.toString(notasCarla));
        int[] notasCarlaAuxiliares = notasCarla;
        notasCarla = new int[4];

        //Copiamos los valores

        for (int i = 0; i < notasCarlaAuxiliares.length; i++) {
            notasCarla[i] = notasCarlaAuxiliares[i];
        }
        notasCarla[3] = 9;
        System.out.println("NotasCarla: " + Arrays.toString(notasCarla));
        System.out.println("NotasCarlaAuxiliares" + Arrays.toString(notasCarlaAuxiliares));

        //
        int[] otra = notasCarla;
        otra[3] = 1;
        System.out.println("otra" + Arrays.toString(notasCarla));
        //
        int[] masNotas = {4, 5, 6, 7};
        System.out.println("masnotas" + masNotas);


    }
}
