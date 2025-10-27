package T2Ejercicios1.ejers3;

import java.util.Scanner;

public class Ejer_4 {

    //Escribe un metodo para calcular el area de un rectangulo dados base y altura.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la base del rectangulo");
        double base = scanner.nextDouble();
        System.out.println("Dime la altura del rectangulo");
        double altura = scanner.nextDouble();

        double area = calculaArea(base, altura);
        System.out.println("El area del rectangulo es: " + area);

    }

    private static double calculaArea(double base, double altura) {
        return base * altura;
    }
}
