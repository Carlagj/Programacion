package Tema4.Herencia3;

public class Patinete extends VehiculoSinMotor {
    int ruedas;

    public Patinete(String color, String modelo, double precio, String marca, String material, int ruedas) {
        super(color, modelo, precio, marca, material);
        this.ruedas = ruedas;
    }


    public String toString() {
        return super.toString() + " ruedas " + ruedas;
    }
}
