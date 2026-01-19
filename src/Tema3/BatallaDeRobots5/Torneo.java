package Tema3.BatallaDeRobots5;

public class Torneo {
    public static void main(String[] args) {

        Robot mazinger = new Robot("Mazinger", "Z");
        Robot optimus = new Robot("Optimus", "Prime");

        System.out.println("Estadisticas iniciales");
        System.out.println(mazinger);
        System.out.println(optimus);
        System.out.println();


        while (mazinger.estaVivo() && optimus.estaVivo()) {

            mazinger.atacar(optimus);

            if (optimus.estaVivo()){
                optimus.atacar(mazinger);
            }
        }

        System.out.println("Despues del asalto:");
        System.out.println(mazinger + "Vida: " + );
        System.out.println();
        System.out.println();



    }
}
