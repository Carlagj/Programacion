package Tema5.streams1;

import java.util.List;

public class Ejer2 {
    public static void main(String[] args) {
        List<String> alumnos = List.of("ana", "luis", "guzmán", "marta");

        List<String> alumnosMayusculas = alumnos.stream()
                .map(nombre -> nombre.toUpperCase())
                .toList();

        System.out.println(alumnosMayusculas);
    }
}
