package Tema5.Videoclub;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        VideoClub miClub = new VideoClub();

        Cliente c1 = new Cliente(1, "Ana Lopez");
        Cliente c2 = new Cliente(2, "Pedro Marmol");
        Pelicula p1 = new Pelicula(101, "Batman");
        Pelicula p2 = new Pelicula(102, "Star Wars");

        miClub.añadirCliente(c1);
        miClub.añadirCliente(c2);
        miClub.añadirPelicula(p1);
        miClub.añadirPelicula(p2);

        Prestamo pres1 = new Prestamo(p1, c1);
        miClub.añadirPrestamo(pres1);

        Prestamo pres2 = new Prestamo(p2, c2);
        pres2.setFechadevolucion(LocalDate.now().minusDays(1));
        miClub.añadirPrestamo(pres2);


        System.out.println("============= ESTADO DEL VIDEOCLUB =============");

        System.out.println("=== LISTADO DE CLIENTES ===");
        System.out.println(miClub.ListaClientes);
        System.out.println("\n=== LISTADO DE PELÍCULAS ===");
        System.out.println(miClub.ListaPeliculas);

        System.out.println("\n=== BUSCANDO MOROSOS ===");
        ArrayList<Prestamo> morosos = miClub.prestamosMorosos();
        if (morosos.isEmpty()) {
            System.out.println("No hay morosos por ahora.");
        } else {
            for (Prestamo m : morosos) {
                System.out.println("¡MOROSO! -> " + m.getCliente().getNombre() +
                        " debe la película: " + m.getPelicula().getTitulo());
            }
        }

        System.out.println("\n=== PROCESANDO DEVOLUCIÓN ===");

        boolean exito = miClub.devolucion(102, 2);
        if (exito) {
            System.out.println("Devolución realizada con éxito.");
        } else {
            System.out.println("No se encontró el préstamo.");
        }
        System.out.println("\nPréstamos tras la devolución: " + miClub.ListaPrestamos.size());

    }
}