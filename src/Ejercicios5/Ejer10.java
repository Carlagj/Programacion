package Ejercicios5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejer10 {
    /*
     Desarrolla un programa que simule el juego del ahorcado. Elegimos una palabra y vamos pidiendo letras al usuario.
     Cada vez mostramos la palabra solo con las letras acertadas. Si no acierta todas las letras en 8 intentos, se da el juego por perdido.
     */
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                String palabraSecreta = "programacion";  // palabra elegida
                Set<Character> letrasAdivinadas = new HashSet<>();
                int intentosRestantes = 8;

                System.out.println("¡Bienvenido al juego del Ahorcado!");

                while (intentosRestantes > 0) {

                    // Mostrar palabra con letras acertadas
                    StringBuilder mostrar = new StringBuilder();
                    for (char c : palabraSecreta.toCharArray()) {
                        if (letrasAdivinadas.contains(c)) {
                            mostrar.append(c);
                        } else {
                            mostrar.append("_");
                        }
                    }

                    System.out.println("\nPalabra: " + mostrar);
                    System.out.println("Intentos restantes: " + intentosRestantes);
                    System.out.print("Introduce una letra: ");

                    char letra = sc.next().toLowerCase().charAt(0);

                    if (letrasAdivinadas.contains(letra)) {
                        System.out.println("Ya habías probado esa letra.");
                        continue;
                    }

                    letrasAdivinadas.add(letra);

                    if (palabraSecreta.indexOf(letra) == -1) {
                        intentosRestantes--;
                        System.out.println("Letra incorrecta.");
                    } else {
                        System.out.println("¡Bien hecho!");
                    }

                    // Comprobar si ya se completó la palabra
                    boolean completa = true;
                    for (char c : palabraSecreta.toCharArray()) {
                        if (!letrasAdivinadas.contains(c)) {
                            completa = false;
                            break;
                        }
                    }

                    if (completa) {
                        System.out.println("\n¡Has acertado la palabra!: " + palabraSecreta);
                        return;
                    }
                }

                System.out.println("\nHas perdido. La palabra era: " + palabraSecreta);


        sc.close();
    }
}
