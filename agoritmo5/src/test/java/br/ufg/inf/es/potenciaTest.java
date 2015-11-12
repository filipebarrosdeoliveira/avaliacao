package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class potenciaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testXInvalido() throws Exception {
        potencia.Potencia(0, 9);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testYInvalido() throws Exception {
        potencia.Potencia(3, -9);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(1, potencia.Potencia(1, 1));
    }

}