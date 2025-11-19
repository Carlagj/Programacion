package EjersExam2;

public class Ejer4 {
/*
Tenemos que calcular en una función la lógica de negocio de una biblioteca.
Parámetros:
Nombre libro
Plazo de préstamo: días iniciales para hacer el cálculo
Categoría: ficción (sí/no), referencia o infantil
Novedad: sí/no
Bestseller: sí/no
Lenguaje: texto corto, ES para español, EN para inglés, FR para francés...
Función para calcular el plazo de préstamo:
El plazo base del préstamo es de 12 días, pero personalizable.
Si la categoría es referencia o infantil, el plazo aumenta en 5 días.
Si es una novedad, el plazo máximo es de 10 días.
Si es un bestseller, el plazo disminuye en 4 días.
Si el lenguaje no es español el plazo aumenta en 3 días.
Si el lenguaje es inglés y la categoría es ficción, el plazo disminuye 2 días.
Las reducciones y aumentos son acumulativos.
El plazo nunca puede ser menor de 3 días, independientemente de las reducciones.
El plazo nunca puede ser mayor de 20 días, independientemente de los aumentos.
Función para calcular la multa. Una vez calculado el plazo de préstamo, se crea una nueva función con todos los mismos parámetros, más dos, uno es un entero con los días máximos de préstamo (calculado en la función previa), el otro es el precio de compra del libro. La función devolverá un número que será el precio de la multa.
La multa base es de 0.50€ por cada día de retraso.
Si la categoría es referencia, aumenta la multa en 0.50€ por cada día de retraso.
Si la categoría es infantil, aumenta la multa en 0.25€ por cada día de retraso.
Si es una novedad, aumenta la multa en 0.40€ por cada día de retraso.
Si es un bestseller, aumenta la multa en 0.75€ por cada día de retraso.
La multa no puede ser mayor que el precio del libro.
 */

    public static int calcularPlazoPrestamo(
            String nombre,
            int plazoBase,
            String categoria,   // "ficcion", "referencia", "infantil"
            boolean novedad,
            boolean bestseller,
            String lenguaje     // "ES", "EN", "FR", etc.
    ) {

        int plazo = plazoBase;

        // Categoría: referencia o infantil → +5 días
        if (categoria.equalsIgnoreCase("referencia") ||
                categoria.equalsIgnoreCase("infantil")) {
            plazo += 5;
        }

        // Novedad → plazo máximo 10
        if (novedad) {
            plazo = 10;
        }

        // Bestseller → -4 días
        if (bestseller) {
            plazo -= 4;
        }

        // Lenguaje no español → +3 días
        if (!lenguaje.equalsIgnoreCase("ES")) {
            plazo += 3;
        }

        // Si es inglés y ficción → -2 días
        if (lenguaje.equalsIgnoreCase("EN") &&
                categoria.equalsIgnoreCase("ficcion")) {
            plazo -= 2;
        }

        // LÍMITES
        if (plazo < 3) plazo = 3;
        if (plazo > 20) plazo = 20;

        return plazo;
    }


    // -------------------------------------------------------------
    // 2. FUNCION PARA CALCULAR LA MULTA
    // -------------------------------------------------------------
    public static double calcularMulta(
            String nombre,
            int diasPrestamoMax,   // el calculado en la función anterior
            int diasRealesPrestamo,
            String categoria,
            boolean novedad,
            boolean bestseller,
            double precioLibro
    ) {

        int retraso = diasRealesPrestamo - diasPrestamoMax;

        if (retraso <= 0) return 0.0;

        // Multa base
        double multaPorDia = 0.50;

        // Categoría referencia → +0.50
        if (categoria.equalsIgnoreCase("referencia")) {
            multaPorDia += 0.50;
        }

        // Categoría infantil → +0.25
        if (categoria.equalsIgnoreCase("infantil")) {
            multaPorDia += 0.25;
        }

        // Novedad → +0.40
        if (novedad) {
            multaPorDia += 0.40;
        }

        // Bestseller → +0.75
        if (bestseller) {
            multaPorDia += 0.75;
        }

        double multaTotal = multaPorDia * retraso;

        // No puede superar el precio del libro
        if (multaTotal > precioLibro) {
            multaTotal = precioLibro;
        }

        return multaTotal;
    }


    // -------------------------------------------------------------
    // EJEMPLO DE USO
    // -------------------------------------------------------------
    public static void main(String[] args) {

        int plazo = calcularPlazoPrestamo(
                "El Quijote",
                12,
                "ficcion",
                false,
                true,
                "EN"
        );

        System.out.println("Plazo máximo: " + plazo + " días");

        double multa = calcularMulta(
                "El Quijote",
                plazo,
                20,          // Días reales
                "ficcion",
                false,
                true,
                30.0         // Precio del libro
        );

        System.out.println("Multa: " + multa + " €");
    }

}
