package Repaso;

public class Ejer7 {
    public static void main(String[] args) {
        int n = 5;
        int n1 = 2;

        int resul = suma(n, n1);
        saludar();
        System.out.println(resul);
    }

    static void saludar() {
        System.out.println("Hola buenas");
    }

    static int suma(int n, int n1) {
        int resultado = n + n1;
        return resultado;

    }

}
