package Tema4.Herencia;

public class Videojuego {
    String nombre;
    double precio;


    public Videojuego(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

    }


    public String toString() {
        return nombre + " (" + precio + "€)";
    }
}
