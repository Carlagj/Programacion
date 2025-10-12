package T2Ejrs2;

public class Ejer_8 {

    // Muestra los números primos entre 1 y 100.
    static void main() {

        System.out.println("Numeros primos entre 1 y 100: ");

        int num = 2;


        while (num <= 100 ) {
            boolean esPrimo = true;
            int i = 2;

            // dividimos todos los numeros entre 2

            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
                i++;
            }
            if (esPrimo) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
