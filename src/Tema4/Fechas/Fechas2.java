package Tema4.Fechas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Fechas2 {
    public static void main(String[] args) {


    /*
    Crea un programa que pida al usuario su fecha de nacimiento (día y mes) y
    calcule cuántos días faltan para su próximo cumpleaños desde hoy (02/04/2025).
     */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu dia de nacimiento (numeros)");
        int dia = sc.nextInt();


        System.out.println("Escribe tu mes de nacimiento (numeros)");
        int mes = sc.nextInt();

        sc.close();

        LocalDate cumple = LocalDate.of(LocalDate.now().getYear(), mes, dia);
        LocalDate hoy = LocalDate.now();

        System.out.println(Period.between(cumple, hoy));


    }
}
