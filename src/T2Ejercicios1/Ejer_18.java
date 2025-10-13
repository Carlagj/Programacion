package T2Ejercicios1;

import java.math.BigInteger;

public class Ejer_18 {
    static void main() {

        //Escribir un programa en Java que multiplique los 20 primeros números naturales (1*2*3*4*5…).

        long resultado = 1; // empezamos en 1

        for (int i = 1; i <= 20; i++) {
            long anterior = resultado ;
            resultado = resultado * i;

            System.out.println(anterior + " x " + i + " = " + resultado);
        }
    }
}
