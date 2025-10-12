package T2Ejercicios1;

public class Ejer_8 {
    public static void main(String[] args) {
        System.out.println("Numeros pares entre 5 y 15000:");
        // bucle
        for (int i = 5; i <= 15000; i++) {
             if (i % 2 == 0) {
                 System.out.println(i);
             }
        }
    }
}
