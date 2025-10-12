package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();

        if (num2 == 0){
            System.out.println("Error: No se puede dividir entre cero");
        }else {
            double resultado = num1 /  num2;
            System.out.println("El resultado de la division es: " + resultado);
        }
        scanner.close();
    }
}
