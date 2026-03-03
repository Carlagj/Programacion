package Tema4.Excepciones.Presentacion;

public class Producto {

    private double precio;

    public void establecerPrecio(double nuevoPrecio) throws ValorInvalidpException {
        if (nuevoPrecio < 0) {
            throw new ValorInvalidpException("El precio no puede ser negativo");

        }
        precio = nuevoPrecio;
    }
}
