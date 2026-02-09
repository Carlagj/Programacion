package Tema4.Herencia6;

public class Plato {
    protected String nombre;
    protected double precio;


    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {

        return precio;
    }

    public String toString() {

        return nombre + " -> " + precio + "€";
    }
}
