package Tema5.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ejer4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);


        int suma = numeros.stream()
                .mapToInt(n -> n)
                .sum();


        OptionalDouble promedio = numeros.stream()
                .mapToInt(n -> n)
                .average();

        
        System.out.println("Suma: " + suma);

        if (promedio.isPresent()) {
            System.out.println("Promedio: " + promedio.getAsDouble());
        } else {
            System.out.println("No hay promedio disponible");
        }
    }
}
