package Tema3.BatallaDeRobots5;

public class Torneo {
    public static void main(String[] args) {

        Robot Robot1 = new Robot("Mazinger", "Z");
        Robot Robot2 = new Robot("Optimus", "Prime");

        System.out.println("Estadisticas iniciales");
        Robot1.mostrarEstadisticas();
        Robot2.mostrarEstadisticas();
        System.out.println();

        int ronda = 1;
        while (Robot1.estaVivo() && Robot2.estaVivo()) {

            System.out.println(" - Ronda " + ronda + " - ");
            System.out.println("--------------------------");

            Robot1.atacar(Robot2);

            if (Robot2.estaVivo()) {
                Robot2.atacar(Robot1);
            }
            System.out.println(" ");
            System.out.println("Vida restante: ");

            System.out.println(Robot1.getNombre() + " -> " + Robot1.getVida());
            System.out.println(Robot2.getNombre() + " -> " + Robot2.getVida());
            System.out.println(" ");

            ronda++;
        }

        System.out.println(" ");
        System.out.println("Despues del asalto:");
        System.out.println("--------------------");
        System.out.println(Robot1.getNombre() + " -> " + Robot1.getVida());
        System.out.println(Robot2.getNombre() + " -> " + Robot2.getVida());
        System.out.println();


        System.out.println("----------------------------------");
        if (Robot1.estaVivo()) {
            System.out.println("        " + "Ganador: " + Robot1.getNombre());
        } else {
            System.out.println("        " + "Ganador: " + Robot2.getNombre());
        }

        System.out.println("----------------------------------");
    }
}
