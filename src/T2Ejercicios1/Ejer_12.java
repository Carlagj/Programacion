package T2Ejercicios1;

public class Ejer_12 {
    public static void main(String[] args) {
        System.out.println("Numeros del 1 al 100 divisibles entre 2 y 3:");

        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
