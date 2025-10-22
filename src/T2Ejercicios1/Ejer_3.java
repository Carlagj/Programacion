package T2Ejercicios1;

import java.util.Scanner;

public class Ejer_3 {
    public static void main(String[] args) {

        /*
        Desarrolla un programa que,
        dado un número entre el 1 y el 7,
        indique el día de la semana del que se trata.
       */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero entre el 1 y el 7 para saber su dia de la semana");
        int numero = scanner.nextInt();

        String dia;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = " El numero no es valido. Ya que no esta entre el 1 y el 7.";
        }

        System.out.println(dia);

        scanner.close();
    }
}
