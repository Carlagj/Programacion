package Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        String[] nombres = new String[3];
        int[] Telf = new int[3];

        nombres = new String[3];
        nombres[0] = "Carla";
        nombres[1] = "Gabriel";
        nombres[2] = "Marco";
        System.out.println();

        Telf = new int[3];
        Telf[0] = 654987123;
        Telf[1] = 652314987;
        Telf[2] = 678945632;


        String[] combinados = new String[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            combinados[i] = nombres[i] + " - " + Telf[i];
        }

        System.out.println("Combinada:");
        for (String contacto : combinados) {
            System.out.println(contacto);
        }
    }
}
