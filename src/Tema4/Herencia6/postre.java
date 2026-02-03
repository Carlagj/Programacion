package Tema4.Herencia6;

public class postre extends plato {
    private boolean diabetico;


    public postre(String nombre, double precio, boolean diabeticos) {
        super(nombre, precio);
        this.diabetico = diabetico;
    }


    public String toString() {
        return "Postre: " + super.toString() + " Diabetico: " + (diabetico ? "Si" : "No");

    }
}
