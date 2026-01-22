package Tema3.GestionDeInventario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductoTest {

    @Test
    void vender() {
        Producto p = new Producto("rosa", 20, 2);

        p.vender(1);
        assertEquals(1, p.stock);

    }

    @Test
    void reponer() {
        Producto p = new Producto("rosa", 20, 2);

        p.reponer(1);
        assertEquals(3, p.stock);

    }
}