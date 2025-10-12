package T2Ejercicios1;

import java.math.BigInteger;

public class Ejer_18 {
    static void main() {
        BigInteger resultado = BigInteger.ONE;

        for (int i =1; i <= 20; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        System.out.println("El resultado de multiplicar los 20 primeros numeros naturales es: " );
        System.out.println(resultado);
    }
}
