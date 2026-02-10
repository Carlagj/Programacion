package Tema4.Electrodomesticos;

public class Television extends Electrodomestico {
    private int pulgadas;
    private boolean oled;

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int pulgadas, boolean oled) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.oled = oled;
    }


    private double precioFinal(int pulgadas) {
        double precio = precioBase;
        
        if (pulgadas >= 60) {
            precio += (precio * 0.30);
        }
        return precio;

    }


}
