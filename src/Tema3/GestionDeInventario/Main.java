package Tema3.GestionDeInventario;

public class Main {
    public static void main(String[] args) {
        Producto libro = new Producto("rosa", 21.89, 3);
        libro.mostrarInfo();
        libro.vender(1);
        libro.mostrarInfo();
        libro.reponer(-1);
        libro.mostrarInfo();
        libro.vender(4);
        libro.mostrarInfo();
        libro.reponer(7);
        libro.mostrarInfo();
    }
}
