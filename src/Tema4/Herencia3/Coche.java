package Tema4.Herencia3;

public class Coche extends VehiculosConMotor {
    int puertas;

    public Coche(String color, String modelo, double precio, String marca, String cilindrada, String combustible, int puertas) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.puertas = puertas;
    }


    public String toString() {
        return super.toString() + " puertas " + puertas;
    }
}
