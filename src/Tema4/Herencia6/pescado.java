package Tema4.Herencia6;

public class pescado extends plato {

    public pescado(String nombre, double precio) {
        super(nombre, precio);
    }


    public String toString() {
        return "Pescado: " + super.toString();
    }
}
