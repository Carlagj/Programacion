package Tema4.Electrodomesticos;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }


    private double precioFinal(double precio){
        if (carga > 30){
            precio += 50;
        }
        return precio;
    }

    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso + "Precio toral"+ pre
                '}';
    }
}
