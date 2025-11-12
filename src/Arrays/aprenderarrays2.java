package Arrays;

import java.util.Arrays;

public class aprenderarrays2 {
    public static void main(String[] args) {

        String[] datosF = {"Felipe", "Garcia", "AV. La Palmera1"};
        String[] datosL = {"Laura", "Gonzalez", "Calle La Pluma 4"};
        String[] datosA = {"Abrahan", "Jimenez", "calle juan 1"};

        System.out.println(Arrays.toString(datosF));
        System.out.println(Arrays.toString(datosL));
        System.out.println(Arrays.toString(datosA));

        String[][] alumnos = {datosF, datosL, datosA};
        //alumnos = new String[3][3];
        System.out.println("Vamos a imprimir el array de arrays");

        for (String[] alumno : alumnos) {
            System.out.println(Arrays.toString(alumno));
        }


    }
}
