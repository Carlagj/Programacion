package Tema3.Gimnasio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SocioTest {
    @Test
    void probarIds() {

        Socio socio1 = new Socio("jose luis");

        assertEquals(1, Socio.getContadorSocios());

        Socio socio2 = new Socio("luis");

        assertEquals(2, Socio.getContadorSocios());

        assertEquals(1, socio1.getId());
        assertEquals(2, socio2.getId());


    }

}