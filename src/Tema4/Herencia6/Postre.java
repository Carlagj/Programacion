package Tema4.Herencia6;

public class Postre extends Plato {
    private boolean diabetico;


    public Postre(String nombre, double precio, boolean diabetico) {
        super(nombre, precio);
        this.diabetico = diabetico;
    }

    public boolean esAptoParaDiabeticos() {
        return diabetico;
    }

    public String toString() {
        return "Postre: " + super.toString() + " Diabetico: " + (diabetico ? "Si" : "No");

    }


}
