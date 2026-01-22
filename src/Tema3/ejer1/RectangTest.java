package Tema3.ejer1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangTest {

    @Test
    void creacion() {
        Rectang r = new Rectang();
        assertEquals(5, r.getLargo());
        assertEquals(10, r.getAncho());


        Rectang r3 = new Rectang(-1, 9);
        assertEquals(5, r3.getLargo());
        assertEquals(10, r3.getAncho());

        
    }

    @Test
    void setAncho() {
    }

    @Test
    void getPerimetro() {
    }
}