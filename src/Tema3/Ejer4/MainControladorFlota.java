package Tema3.Ejer4;

public class MainControladorFlota {
    public static void main(String[] args) {

        NaveEspacial[] flota = new NaveEspacial[3];

        flota[0] = new NaveEspacial("1", 10);
        flota[1] = new NaveEspacial("2", 23);
        flota[2] = new NaveEspacial("3");

        flota[0].viajar(30);
        flota[1].viajar(60);

        System.out.println("Estado de la flota ");
        System.out.println("__________________");
        for (NaveEspacial nave : flota) {
            nave.mostrarEstado();
        }

        System.out.println("");
        System.out.println("Mostrar estado de nave sin conbustible: ");
        flota[0].mostrarEstado();
        flota[0].repostar();

        System.out.println("");
        System.out.println("Despues de repostar: ");

        flota[0].mostrarEstado();


        System.out.println("La nave con mayor energia es la: ");
        int nave1 = flota[0].getCombustible();
        int nave2 = flota[1].getCombustible();
        int nave3 = flota[2].getCombustible();

        if (nave1 > nave2 && nave1 > nave3) {
            System.out.println("Nave 1 es la de mayor energía");
        } else if (nave2 > nave1 && nave2 > nave3) {
            System.out.println("Nave 2 es la de mayor energía");
        } else if (nave3 > nave1 && nave3 > nave2) {
            System.out.println("Nave 3 es la de mayor energía");
        } else {
            System.out.println("Todas estan con energía");
        }
    }

}
