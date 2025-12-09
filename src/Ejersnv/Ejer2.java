package Ejersnv;

public class Ejer2 {
    public static void main(String[] args) {

        String frase = "java es facil";

        System.out.println("Cambiar a mayusculas: " + frase.toUpperCase());
        System.out.println("Reemplazo: " + frase.replace("facil", "poderoso"));
        System.out.println("Extraer: " + frase.substring(0, 4));
        String invertida = new StringBuilder(frase).reverse().toString();
        System.out.println("invertir cadena: " + invertida);

    }
}
