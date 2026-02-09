package Tema4.Herencia6;

public class Pescado extends Plato {

    public Pescado(String nombre, double precio) {
        super(nombre, precio);
    }


    public String toString() {
        return "Pescado: " + super.toString();
    }
}
