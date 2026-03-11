package Tema5.Ejercicios3;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private Cliente cliente;
    private List<VideoJuego> articulos;
    private LocalDate fecha;


    public Venta(Cliente cliente, List<VideoJuego> articulos, LocalDate fecha) {
        this.cliente = cliente;
        this.articulos = articulos;
        this.fecha = LocalDate.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<VideoJuego> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<VideoJuego> articulos) {
        this.articulos = articulos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}

