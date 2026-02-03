package Tema4.Herencia3;

public class VehiculoSinMotor extends Vehiculos {
    String material;

    public VehiculoSinMotor(String color, String modelo, double precio, String marca, String material) {
        super(color, modelo, precio, marca);
        this.material = material;
    }


    public String toString() {
        return super.toString() + " material " + material;
    }
}
