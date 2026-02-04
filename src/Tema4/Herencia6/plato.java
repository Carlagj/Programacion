package Tema4.Herencia6;

public class plato {
    protected String nombre;


    protected double precio;


    public plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public boolean esAptoParaDiabeticos() {
        return false;
    }

    public double getPrecio() {

        return precio;
    }

    public String toString() {

        return nombre + " -> " + precio + "€";
    }
}
