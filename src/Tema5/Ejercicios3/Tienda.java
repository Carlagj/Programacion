package Tema5.Ejercicios3;

import java.time.LocalDate;
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
        //videojuegos
        inventario.add(new VideoJuego("Elden Ring", "PS5", "RPG", 60.0, 10));
        inventario.add(new VideoJuego("Halo Infinite", "Xbox", "Shooter", 50.0, 5));
        inventario.add(new VideoJuego("Zelda", "Switch", "Aventura", 55.0, 0));
        //clientes
        clientes.add(new Cliente(1, "Ana", "García", "Calle Mayor 1", "ana@email.com"));
        clientes.add(new Cliente(2, "Luis", "Pérez", "Plaza España 5", "luis@mail.es"));
        // inventario
        System.out.println("--- INVENTARIO COMPLETO ---");
        for (VideoJuego videoJuego : inventario) {
            System.out.println(videoJuego);
        }

        System.out.println("\n--- CONSULTA DE TÍTULO ---");
        consultarTitulo("Elden Ring");

        System.out.println("\n--- CONSULTA DE STOCK ---");
        consultarStock("Halo Infinite");

        System.out.println("\n--- BÚSQUEDA DE CLIENTE ---");
        buscarCliente("luis@mail.es");

        System.out.println("\n--- REGISTRANDO VENTAS ---");
        registrarVenta(1, "Elden Ring");
        registrarVenta(2, "Elden Ring");
        // historial de ventas
        System.out.println("\n--- HISTORIAL DE VENTAS ---");
        for (Venta v : historialVentas) {
            System.out.println("Fecha: " + v.getFecha() + " | Cliente: " + v.getCliente().getNombre() + " | Total: " + v.getTotalVenta() + "€");
        }
        // historial de ventas de hoy
        System.out.println("\n--- VENTAS DE HOY (" + LocalDate.now() + ") ---");
        mostrarVentasFecha(LocalDate.now());

        mostrarEstadisticas();
    }


    public void consultarStock(String titulo) {
        for (VideoJuego vj : inventario) {
            if (vj.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("El stock de " + titulo + " es: " + vj.getStock());
            }
        }
    }

    public void buscarCliente(String criterio) {
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(criterio) ||
                    c.getApellido().equalsIgnoreCase(criterio) ||
                    c.getEmail().equalsIgnoreCase(criterio) ||
                    String.valueOf(c.getCodCliente()).equals(criterio)) {
                System.out.println("Cliente encontrado: " + c);
            }
        }
    }

    public void mostrarVentasFecha(LocalDate fecha) {
        for (Venta v : historialVentas) {
            if (v.getFecha().equals(fecha)) {
                System.out.println("- Venta a " + v.getCliente().getNombre() + " (Artículos: " + v.getArticulos().size() + ")");
            }
        }
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
            List<VideoJuego> carrito = new ArrayList<>();
            carrito.add(juegoEncontrado);
            historialVentas.add(new Venta(clienteEncontrado, carrito));
            System.out.println("Venta confirmada: " + tituloJuego + " para " + clienteEncontrado.getNombre());
        } else {
            System.out.println("No se pudo realizar la venta de: " + tituloJuego);
        }
    }

    public void consultarTitulo(String criterio) {
        for (VideoJuego vj : inventario) {
            if (vj.getTitulo().equalsIgnoreCase(criterio) || vj.getId().toString().contains(criterio)) {
                System.out.println("Juego encontrado: " + vj);
            }
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- BOLA EXTRA: ESTADÍSTICAS ---");
        String[] plataformas = {"PS5", "Xbox", "PC", "Switch"};
        for (String p : plataformas) {
            int total = 0;
            for (Venta v : historialVentas) {
                for (VideoJuego art : v.getArticulos()) {
                    if (art.getPlataforma().equalsIgnoreCase(p)) total++;
                }
            }
            if (total > 0) System.out.println("Acumulado " + p + ": " + total + " ventas.");
        }

        List<String> generosVistos = new ArrayList<>();
        for (VideoJuego vj : inventario) {
            if (!generosVistos.contains(vj.getGenero())) {
                generosVistos.add(vj.getGenero());
                int contGen = 0;
                for (Venta ven : historialVentas) {
                    for (VideoJuego art : ven.getArticulos()) {
                        if (art.getGenero().equalsIgnoreCase(vj.getGenero())) contGen++;
                    }
                }
                System.out.println("Acumulado Género " + vj.getGenero() + ": " + contGen);
            }
        }

        String tituloTop = "Ninguno";
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
        System.out.println("Título más vendido: " + tituloTop + " (" + maxVentas + ")");
    }
}
