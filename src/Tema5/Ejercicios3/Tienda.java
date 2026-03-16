package Tema5.Ejercicios3;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<VideoJuego> inventario = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> historialVentas = new ArrayList<>();

    public static void main(String[] args) {
        Tienda miTienda = new Tienda();
        miTienda.ejecutarTienda();
    }

    public void ejecutarTienda() {

        inventario.add(new VideoJuego("Elden Ring", "PS5", "RPG", 60.0, 10));
        inventario.add(new VideoJuego("Halo Infinite", "Xbox", "Shooter", 50.0, 5));
        clientes.add(new Cliente(1, "Ana", "García", "Calle Mayor 1", "ana@email.com"));
        System.out.println("--- INVENTARIO ---");
        for (VideoJuego vj : inventario) {
            System.out.println(vj);
        }

        registrarVenta(1, "Elden Ring");
        mostrarEstadisticas();
    }


    public void registrarVenta(int idCliente, String tituloJuego) {
        Cliente clienteEncontrado = null;
        for (Cliente c : clientes) {
            if (c.getCodCliente() == idCliente) {
                clienteEncontrado = c;
                break;
            }
        }
        VideoJuego juegoEncontrado = null;
        for (VideoJuego vj : inventario) {
            if (vj.getTitulo().equalsIgnoreCase(tituloJuego)) {
                juegoEncontrado = vj;
                break;
            }
        }
        if (clienteEncontrado != null && juegoEncontrado != null && juegoEncontrado.getStock() > 0) {
            juegoEncontrado.setStock(juegoEncontrado.getStock() - 1);
            List<VideoJuego> articulosVenta = new ArrayList<>();
            articulosVenta.add(juegoEncontrado);
            historialVentas.add(new Venta(clienteEncontrado, articulosVenta));
            System.out.println("\nVenta registrada con éxito para: " + clienteEncontrado.getNombre());
        }
    }


    public void consultarTitulo(String criterio) {
        for (VideoJuego vj : inventario) {
            if (vj.getTitulo().equalsIgnoreCase(criterio) || vj.getId().toString().contains(criterio)) {
                System.out.println("Resultado: " + vj);
            }
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- ESTADÍSTICAS DE VENTAS ---");

        String[] plataformas = {"PS5", "Xbox", "PC", "Switch"};
        for (String plat : plataformas) {
            int contador = 0;
            for (Venta v : historialVentas) {
                for (VideoJuego art : v.getArticulos()) {
                    if (art.getPlataforma().equalsIgnoreCase(plat)) {
                        contador++;
                    }
                }
            }
            if (contador > 0) System.out.println("Ventas en " + plat + ": " + contador);
        }

        String tituloTop = "";
        int maxVentas = 0;
        for (VideoJuego vj : inventario) {
            int ventasJuego = 0;
            for (Venta v : historialVentas) {
                for (VideoJuego art : v.getArticulos()) {
                    if (art.getTitulo().equals(vj.getTitulo())) ventasJuego++;
                }
            }
            if (ventasJuego > maxVentas) {
                maxVentas = ventasJuego;
                tituloTop = vj.getTitulo();
            }
        }
        System.out.println("Título más vendido: " + tituloTop + " (" + maxVentas + " unidades)");
    }
}
