package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class calendarioTest {



    @Test (expected = IllegalArgumentException.class)
    public void testDiaInvalido() throws Exception {
        calendario.Calendario(50, 10, 2000);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMesInvalido() throws Exception {
        calendario.Calendario(1, 0, 2015);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAnoInvalido() throws Exception {
        calendario.Calendario(11, 11, 999);
    }

    @Test
    public void testVerdadeiro() throws Exception {

        assertEquals(6, calendario.Calendario(5, 4, 2015));
    }
}
