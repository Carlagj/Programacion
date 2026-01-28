package Tema4.Fechas;

import java.time.LocalDate;

public class Fechas4 {
    /*
    Crea un metodo que reciba una fecha (LocalDate) y devuelva si es sábado o domingo.
     */

    public static boolean esFinDeSemana(LocalDate fecha) {

        return fecha.getDayOfWeek().getValue() >= 6;

    }

}
