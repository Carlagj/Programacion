package Tema4.Fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fechas1 {
    public static void main(String[] args) {
        /*
Escribe un programa que muestre la fecha actual en el formato "Hoy es día, dd de mes de yyyy"
(ejemplo: "Hoy es miércoles, 02 de abril de 2025").
*/


        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter l1 = DateTimeFormatter.ofPattern("'Hoy es ' EEEE, dd 'de' MMMM 'de' yyy  ");

        System.out.println(l1.format(fechaActual));

    }

}
