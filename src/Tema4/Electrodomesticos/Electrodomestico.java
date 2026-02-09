package Tema4.Electrodomesticos;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = validarColor(color);
        this.consumoEnergetico = validarConsumo(consumoEnergetico);
        this.peso = peso;
    }

    private String validarColor(String color) {
        if (color == null) return "Blanco";

        switch (color.toLowerCase()) {
            case "Blanco", "blanco", "BLANCO":
                return "Blanco";
            case "Negro", "negro", "NEGRO":
                return "Negro";
            case "Rojo", "rojo", "ROJO":
                return "Rojo";
            case "Azul", "azul", "AZUL":
                return "Azul";
            case "Gris", "gris", "GRIS":
                return "Gris";
            default:
                return "Blanco";

        }

    }

    private char validarConsumo(char consumo) {
        if (consumo >= 'A' && consumo <= 'F') return consumo;
        return 'F';

    }


    public String toString() {
        return "Electrodomestico{ " +
                "precioBase= " + precioBase +
                ", color= '" + color + '\'' +
                ", consumoEnergetico= " + consumoEnergetico +
                ", peso= " + peso +
                '}';
    }
}
