package Tema4.Herencia3;

public class Moto extends VehiculosConMotor {
    String tipo;

    public Moto(String color, String modelo, double precio, String marca, String cilindrada, String combustible, String tipo) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.tipo = tipo;
    }


    public String toString() {
        return super.toString() + " tipo " + tipo;
    }
}
