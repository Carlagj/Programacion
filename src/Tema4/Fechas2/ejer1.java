package Tema4.Fechas2;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ejer1 {
    /*
    Estás de merecidas vacaciones, y tienes que coger un vuelo para ir a Japón. Los tiempos son los siguientes.

Sales el día 12 de abril del 2025 a las 20:45 de Madrid, y tienes 6:45 de vuelo hasta Doha.

Tienes 1h de tránsito en el aeropuerto
(no tienes que coger las maletas porque has reservado con la misma compañía el vuelo completo a Japón).

Despegas de Doha y tienes 10:25 hasta el aeropuerto de Haneda (Tokio).

     Se pide:

Calcular las horas locales a las que despegas y aterrizas.

Como eres una persona responsable, quieres avisar a tu familia cuando aterrizas, pero no quieres despertarlos, por eso si cuando aterrices es una hora respetable (9am a 22pm), puedes llamar, sino mandas un whatsapp. Calcula en los dos aterrizajes qué debes hacer.

Calcula el tiempo total del viaje (incluida escala).

Si llegas un sábado o domingo, avisa a tus amigos con un whatsapp.
     */
    public static void main(String[] args) {


        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");


        ZonedDateTime salidaMadrid = ZonedDateTime.of(
                2025, 4, 12, 20, 45, 0, 0,
                ZoneId.of("Europe/Madrid"));


        System.out.println("Salida de Madrid: " + salidaMadrid.format(formato));

        ZonedDateTime llegadaDoha = salidaMadrid
                .plusHours(6)
                .plusMinutes(45)
                .withZoneSameInstant(ZoneId.of("Asia/Qatar"));
        System.out.println("Llegada a Doha: " + llegadaDoha.format(formato));


        ZonedDateTime salidaDoha = llegadaDoha.plusHours(1);
        System.out.println("Salida de Doha: " + salidaDoha.format(formato));

        ZonedDateTime llegadaTokio = salidaDoha
                .plusHours(10)
                .plusMinutes(25)
                .withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("Llegada a Tokio: " + llegadaTokio.format(formato));


        avisarFamilia(llegadaTokio);
        avisarAmigosSiFindesemana(llegadaTokio);


        Duration duracion = Duration.between(salidaMadrid, llegadaTokio);
        System.out.println("La duracion total del viaje "
                + duracion.toHours() + " horas y " + (duracion.toMinutes() % 60) + "minutos");


    }

    private static void avisarAmigosSiFindesemana(ZonedDateTime llegada) {
        DayOfWeek dia = llegada.getDayOfWeek();

        if (dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY) {
            System.out.println("Es fin de sema manda un was a tus amigos ");

        }

    }

    private static void avisarFamilia(ZonedDateTime llegada) {
        int hora = llegada.getHour();

        if (hora >= 9 && hora <= 22) {
            System.out.println("Puedes llamar a tu familia");
        } else {
            System.out.println("Mejor manda un was a tu familia");
        }

    }
}
