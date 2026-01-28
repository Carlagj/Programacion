package Tema4.Fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Fechas6 {
    /*
    Crea un programa que cuente cuántos días laborables (lunes a viernes) hay entre el 01/04/2025 y el 15/04/2025.
     */
    public static void main(String[] args) {

        LocalDate inicio = LocalDate.of(2025, 4, 1);
        LocalDate fin = LocalDate.of(2025, 4, 15);
        int contador = 0;
        while (!inicio.isAfter(fin)) {
            DayOfWeek dia = inicio.getDayOfWeek();
            if (dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY) {
                contador++;
            }
            inicio = inicio.plusDays(1);
        }
        System.out.println("Días laborables: " + contador);

    }
}
