package Repaso;

public class Ejer8 {
    public static void main(String[] args) {
        double base = 5;
        double altura = 7;


        double resultado = areaRectangulo(base, altura);
        System.out.println(resultado);
    }

    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
}
