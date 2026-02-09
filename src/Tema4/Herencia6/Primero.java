package Tema4.Herencia6;

public class Primero extends Plato {
    private boolean compartir;


    public Primero(String nombre, double precio, boolean compartir) {
        super(nombre, precio);
        this.compartir = compartir;
    }


    public String toString() {
        return "Primero: " + super.toString() + " Compartir: " + (compartir ? "Si" : "No");
    }
}
