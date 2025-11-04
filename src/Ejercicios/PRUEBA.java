package Ejercicios;

public class PRUEBA {
    public static void main(String[] args) {

        sumaMenoresQueMilDivisiblesEntre13();

    }

    static void sumaMenoresQueMilDivisiblesEntre13() {
        int suma = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 13 == 0 && i % 26 == 0) {
                suma += i;
            }
        }
        System.out.println();
        System.out.println("La suma total es: " + suma);
    }
}


