package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;


public class quadradoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testKInvalido() throws Exception {
        quadrado.Quadrado(0);
    }

    @Test
    public void testQuadradosPerfeitos() throws Exception {
        assertTrue(quadrado.Quadrado(4));
        assertTrue(quadrado.Quadrado(9));
    }
}