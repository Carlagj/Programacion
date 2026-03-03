package Tema4.Excepciones;

public class Divide {

    public static void main(String[] args) {
        double resultado = dividir(3, 4);
        System.out.println("El resultado es: " + resultado);
    }

    public static double dividir(double arriba, double abajo) {
        return arriba / abajo;
    }


}
