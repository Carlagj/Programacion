package Ejercicios5;

public class Ejer1 {
    /*
    Crea un programa que pase un String a mayúsculas y diga cuántas letras han cambiado.
Introduciendo: “Hola a Todos”
Da como salida: “HOLA A TODOS” 8 cambios
     */
    public static void main(String[] args) {

        String saludo = "Hola a Todos";
        String cadenaMayusculas = saludo.toUpperCase();

        System.out.println("Cadena original: " + saludo);
        System.out.println("Cadena en matusculas: " + cadenaMayusculas);

        int cambios = 0;
        for (int i = 0; i < saludo.length(); i++) {
            if (saludo.charAt(i) != cadenaMayusculas.charAt(i))
                cambios++;
        }

        System.out.println("Las letras que han cambiado han sido: " + cambios);
    }
}
