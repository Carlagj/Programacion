package Tema4.Herencia3;

public class VehiculosConMotor extends Vehiculos {
    String cilindrada;
    String combustible;

    public VehiculosConMotor(String color, String modelo, double precio, String marca, String cilindrada, String combustible) {
        super(color, modelo, precio, marca);
        this.cilindrada = cilindrada;
        this.combustible = combustible;
    }

    public String toString() {
        return super.toString() + " clindrada " + cilindrada + "combustible" + combustible;
    }
}
