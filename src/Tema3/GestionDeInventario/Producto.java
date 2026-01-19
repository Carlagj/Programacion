package Tema3.GestionDeInventario;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada correctamente");
        } else {
            System.out.println("No se puede realizar la venta no hay stock suficiente");
        }
    }

    public void reponer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Stock repuesto correctamente");
        }

    }

    public void mostrarInfo() {

        System.out.println();
    }


}


