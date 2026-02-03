package Tema4.Herencia3;

public class Bicicleta extends VehiculoSinMotor {
    int marchas;

    public Bicicleta(String color, String modelo, double precio, String marca, String material, int marchas) {
        super(color, modelo, precio, marca, material);
        this.marchas = marchas;
    }


    public String toString() {
        return super.toString() + " marchas " + marchas;
    }
}
