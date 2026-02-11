package Tema4.Electrodomesticos;

public class Television extends Electrodomestico {
    private int pulgadas;
    private boolean oled;

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int pulgadas, boolean oled) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.oled = oled;
    }


    private double precioFinalA() {
        if (pulgadas >= 60) {
            precio += (precio * 0.30);
        }
        return precio;

    }

    private double precioFinalB() {
        if (oled) {
            return 250;
        }
        return 0;

    }


}
