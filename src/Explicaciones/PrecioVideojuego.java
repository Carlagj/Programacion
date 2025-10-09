package Explicaciones;

public class PrecioVideojuego {
    public static void main(String[] args) {

        double ahorros = 500;
        double precioVideojuego1 = 79.90;
        System.out.println("Tengo " + ahorros + " Ahorrado");
        System.out.println("Me voy a comprar un videojuego que cuesta " + precioVideojuego1);

        ahorros = ahorros - precioVideojuego1;
        System.out.println("Me quedan " + ahorros );
    }
}
