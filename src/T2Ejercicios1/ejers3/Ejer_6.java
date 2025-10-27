package T2Ejercicios1.ejers3;

import java.util.Scanner;

public class Ejer_6 {

    // Metodo que calcule el mayor entre tres números

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int num1 = scanner.nextInt();

        System.out.println("Escribe un segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("escribe un tercer numero");
        int num3 = scanner.nextInt();

        int formula = mayor(num1, num2, num3);
        System.out.println("El mayor es: " + formula);
        scanner.close();
    }

    static int mayor(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

}
