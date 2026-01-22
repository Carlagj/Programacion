package Tema3.GestionDeInventario;

public class Producto {
    String nombre;
    double precio;
    int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock && cantidad > 0)
            stock -= cantidad;

    }

    public void reponer(int cantidad) {
        if (cantidad > 0)
            stock += cantidad;
    }


    public void mostrarInfo() {

        System.out.printf("%s vale %.2f y tiene %d stock\n ", nombre, precio, stock);
    }


    public int getStock() {
        return stock;
    }
}


