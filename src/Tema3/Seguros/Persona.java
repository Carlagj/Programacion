package Tema3.Seguros;

public class Persona {


    // Atributos
    private String nombre;
    private int edad;
    private boolean esFumador;
    private String estadoSalud;

    // Constructor
    public Persona(String nombre, int edad, boolean esFumador, String estadoSalud) {
        this.nombre = nombre;
        this.edad = edad;
        this.esFumador = esFumador;
        this.estadoSalud = estadoSalud;
    }

    // Metodo para calcular el importe del seguro
    public double calcularImporteSeguro() {
        double importe = 500.0; // Base del seguro

        // Ajuste por edad
        if (edad < 25) {
            importe *= 1.20;
        } else if (edad > 40) {
            importe *= 1.10;
        }

        // Ajuste por fumador
        if (esFumador) {
            importe *= 1.30;
        }

        // Ajuste por estado de salud
        switch (estadoSalud.toLowerCase()) {
            case "excelente":
                importe *= 0.80;
                break;
            case "bueno":
                // No cambia
                break;
            case "regular":
                importe *= 1.10;
                break;
            case "malo":
                importe *= 1.20;
                break;
            default:
                System.out.println("Estado de salud no válido.");
        }

        return importe;
    }
}


