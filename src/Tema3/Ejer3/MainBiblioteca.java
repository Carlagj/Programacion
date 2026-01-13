package Tema3.Ejer3;

public class MainBiblioteca {
    public static void main(String[] args) {


        Autor Autor1 = new Autor("Miguel de Cervantes", "Española");
        Libro Libro1 = new Libro(Autor1, "Don Quijote");

        Libro1.prestar();
        Libro1.prestar();
        Libro1.informacion();
    }
}
