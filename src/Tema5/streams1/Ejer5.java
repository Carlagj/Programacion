package Tema5.streams1;

import java.util.Arrays;
import java.util.List;

public class Ejer5 {
    public static void main(String[] args) {
        List<Double> precios = Arrays.asList(19.99, 5.50, 45.0, 120.95, 89.0, 2.30);

        precios.stream()
                .sorted((a, b) -> b.compareTo(a))
                .limit(3)
                .forEach(System.out::println);
    }
}
