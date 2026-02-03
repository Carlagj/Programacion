package Tema4.Herencia3;

public class Vehiculos {
    String color;
    String modelo;
    double precio;
    String marca;

    public Vehiculos(String color, String modelo, double precio, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
    }

    public String toString() {
        return "Es un vehiculo de color " + color + " modelo " + modelo + " precio " + precio + " marca " + marca;
    }
}
