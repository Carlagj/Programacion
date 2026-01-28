package Tema4.Fechas;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Fechas5 {
    /*
    Escribe un programa que calcule cuántas horas y minutos dura una clase (o varias) que introduzca el usuario.
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Hora de inicio (horas :15: minutos)");
        LocalTime inicio = LocalTime.parse(sc.nextLine());

        System.out.print("Hora de fin (HH:mm): ");
        LocalTime fin = LocalTime.parse(sc.nextLine());

        Duration duracion = Duration.between(inicio, fin);
        long horas = duracion.toHours();
        long minutos = duracion.toMinutes() % 60;
        System.out.println("La clase dura " + horas + " horas y " + minutos + " minutos");


    }
}
