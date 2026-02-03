package Tema4.Herencia6;

public class primero extends plato {
    private boolean compartir;


    public primero(String nombre, double precio, boolean compartir) {
        super(nombre, precio);
        this.compartir = compartir;
    }


    public String toString() {
        return "Primero: " + super.toString() + " Compartir: " + (compartir ? "Si" : "No");
    }
}
