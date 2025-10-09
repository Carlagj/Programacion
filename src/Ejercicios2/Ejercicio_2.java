package Ejercicios2;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int C = 20;

        System.out.println((C >=0 )? "Es positivo" : "Es negativo");
        System.out.println((C %2 == 0 )? "Par" : "Impar");
        System.out.println((C %5 == 0)? "Multiplo de 5" : "No es multiplo de 5");
        System.out.println((C %10== 0 )? "Multiplo de 10" : "No es multiplo de 10");
        System.out.println((C >=100 )? "Mayor que 100" : "Menor que 100");
    }

}
