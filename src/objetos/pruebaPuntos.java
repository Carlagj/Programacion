package objetos;

public class pruebaPuntos {
    public static void main(String[] args) {
        Punto puntoA = new Punto(100, 200);
        Punto puntoB = new Punto(400, 800);

        System.out.println(puntoA);
        double distancia = puntoA.distancia(puntoB);
        System.out.println("La diferencia seria: " + distancia);


    }
}
