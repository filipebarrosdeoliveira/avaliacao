package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class somaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testInvalidoX() throws Exception {
        soma.potencia(0, 5);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(1, soma.potencia(1, 1));
    }

}