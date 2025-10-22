package T2Ejrs2;

import java.util.Scanner;

public class Funciones_5 {
    /*
    implementa un metodo que calcule el maximo entre tres numeros.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el primer numero entero");
        int num1 = scanner.nextInt();
        System.out.println("Escribe el segundo numero entero");
        int num2 = scanner.nextInt();
        System.out.println("Escribe el tercer numero entero");
        int num3 = scanner.nextInt();

        scanner.close();

        int formula = mayor(num1, num2, num3);
        System.out.println("el numero mayor es: " + formula);

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
