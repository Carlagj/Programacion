package Tema4.Electrodomesticos;

public class Television extends Electrodomestico {
    private int pulgadas;
    private boolean tdt;
    private boolean oled;

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int pulgadas, boolean tdt, boolean oled) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
        this.oled = oled;
    }
}
