/*package Ejercicios_funciones_avanzados3;

import java.util.Scanner;

public class Seguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int edad = sc.nextInt();

        System.out.println("Has tenido accidentes ecsribe true o false ");
        boolean accidentes = sc.nextBoolean();

        System.out.println("que tipo de seguro quieres 3º grado o a todo riesgo");
        String tipo = sc.nextLine();

        System.out.println("Antiguedad del seguro");
        int AntiSeguro = sc.nextInt();

        System.out.println("Edad del coche");
        int EdadCoche = sc.nextInt();

        System.out.println("Color del coche");
        String color = sc.nextLine();

        sc.close();

        int PrecioBase = 500;

        CostoSeguro(edad,accidentes,tipo,AntiSeguro,EdadCoche,color,PrecioBase);
         double total = CostoSeguro();
        System.out.println("El costo de tu seguro es de: " + );

    }

    private static void CostoSeguro(int edad, boolean accidentes, String tipo, int AntiSeguro, int edadCoche, String color, int precioBase) {

        if (accidentes){
            return precioBase * 1.2;
        }
        if (AntiSeguro > 5){
            return precioBase * 1.1;
        }
        if (edadCoche > 7){
            return precioBase / 0.7;
        }
        if ()
        retur
        }


        if ( edad >= 18)
    }
}
*/