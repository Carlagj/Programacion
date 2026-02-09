package Tema4.Electrodomesticos;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }


}
