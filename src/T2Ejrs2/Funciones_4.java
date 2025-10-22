package T2Ejrs2;

import java.util.Scanner;

public class Funciones_4 {
    /*
    Escribe un metodo para calcular el area de un rectangulo dados base y altura
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la base del triangulo");
        int base = scanner.nextInt();
        System.out.println("escribe la altura del triangulo");
        int altura = scanner.nextInt();

        scanner.close();

        int formula = AreaTriangulo(base, altura);
        System.out.println("El area es " + formula);
    }

    static int AreaTriangulo(int base, int altura) {
        return base * altura;
    }

}
