package Tema4.Electrodomesticos;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    protected double preciFinal;

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = validarColor(color);
        this.consumoEnergetico = validarConsumo(consumoEnergetico);
        this.peso = peso;
        this.preciFinal = precioFinal();
    }


    private String validarColor(String color) {
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


    public double precioFinal() {

        double incremento = 0;

        switch (consumoEnergetico) {

            case "A":
                incremento += 200;
                break;
            case "B":
                incremento += 150;
                break;
            case "C":
                incremento += 100;
                break;
            case "D":
                incremento += 80;
                break;
            case "E":
                incremento += 40;
                break;
            case "F":
                incremento += 10;
                break;

        }

        return precioBase + incremento;

    }


    public String toString() {
        return "Electrodomestico{ " +
                "precioBase= " + precioBase +
                ", color= '" + color + '\'' +
                ", consumoEnergetico= " + consumoEnergetico +
                ", peso= " + peso + "Total" + precioFinal() +
                '}';
    }

    public double getPreciFinal() {
        return preciFinal;
    }


}
