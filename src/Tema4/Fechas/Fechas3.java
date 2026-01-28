package Tema4.Fechas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Fechas3 {
    /*
    Escribe un programa que muestre la hora actual en España ("Europe/Madrid"), Japón ("Asia/Tokyo")
     y México ("America/Mexico_City") en el formato "dd/MM/yyyy HH:mm z".
     */
    public static void main(String[] args) {

        ZonedDateTime España = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime Japon = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime Mexico = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");

        System.out.println(España.format(formato));
        System.out.println(Japon.format(formato));
        System.out.println(Mexico.format(formato));

    }
}
