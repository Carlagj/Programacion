package Tema5.Videoclub;

import java.time.LocalDate;
import java.util.ArrayList;

public class VideoClub {

    public ArrayList<Cliente> ListaClientes = new ArrayList<>();
    public ArrayList<Pelicula> ListaPeliculas = new ArrayList<>();
    public ArrayList<Prestamo> ListaPrestamos = new ArrayList<>();

    public void añadirCliente(Cliente cliente) {
        ListaClientes.add(cliente);
    }

    public void añadirPelicula(Pelicula pelicula) {
        ListaPeliculas.add(pelicula);
    }

    public void añadirPrestamo(Prestamo prestamo) {
        ListaPrestamos.add(prestamo);
    }


    public Pelicula buscarPelicula(int codigo) {
        for (Pelicula pelicula : ListaPeliculas) {
            if (pelicula.getCodigo() == codigo) return pelicula;
        }
        return null;
    }

    public Cliente buscarCliente(int carnet) {
        for (Cliente cliente : ListaClientes) {
            if (cliente.getNumeroCarnet() == carnet) return cliente;
        }
        return null;
    }

    public ArrayList<Prestamo> getPrestamos(int carnet) {
        ArrayList<Prestamo> filtrados = new ArrayList<>();
        for (Prestamo prestamo : ListaPrestamos) {
            if (prestamo.getCliente().getNumeroCarnet() == carnet) {
                filtrados.add(prestamo);
            }
        }
        return filtrados;
    }

    public boolean devolucion(int codPeli, int carnet) {
        for (int i = 0; i < ListaPrestamos.size(); i++) {
            Prestamo p = ListaPrestamos.get(i);
            if (p.getPelicula().getCodigo() == codPeli && p.getCliente().getNumeroCarnet() == carnet) {
                ListaPrestamos.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Prestamo> prestamosMorosos() {
        ArrayList<Prestamo> morosos = new ArrayList<>();
        LocalDate hoy = LocalDate.now();
        for (Prestamo p : ListaPrestamos) {
            if (p.getFechadevolucion().isBefore(hoy)) {
                morosos.add(p);
            }
        }
        return morosos;
    }


    @Override
    public String toString() {
        return "VideoClub{" +
                "ListaClientes=" + ListaClientes +
                ", ListaPeliculas=" + ListaPeliculas +
                ", ListaPrestamos=" + ListaPrestamos +
                '}';
    }
}
