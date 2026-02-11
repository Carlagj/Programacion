package Tema4.Electrodomesticos;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
        this.preciFinal = recargo();
    }


    private double recargo() {
        if (carga > 30) {
            precioBase += 50;
        }
        return precioBase;
    }

    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso + "Precio toral" +
                '}';
    }
}
