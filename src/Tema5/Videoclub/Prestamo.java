package Tema5.Videoclub;

import java.time.LocalDate;

public class Prestamo {
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fechasalida;
    private LocalDate fechadevolucion;

    public Prestamo(Pelicula pelicula, Cliente cliente) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fechasalida = LocalDate.now();
        this.fechadevolucion = fechasalida.plusDays(2);

    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(LocalDate fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "pelicula=" + pelicula +
                ", cliente=" + cliente +
                ", fechasalida=" + fechasalida +
                ", fechadevolucion=" + fechadevolucion +
                '}';
    }
}
