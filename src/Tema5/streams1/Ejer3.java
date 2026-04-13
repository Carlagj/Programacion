package Tema5.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ejer3 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Java", "Programación", "Stream", "Código", "DAM");

        Optional<String> palabraMasLarga = palabras.stream()
                .max((p1, p2) -> Integer.compare(p1.length(), p2.length()));

        palabraMasLarga.ifPresent(p -> System.out.println("La palabra más larga es: " + p));


    }
}
