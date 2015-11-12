package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;

public class sqrtTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception{
        sqrt.raiz(0, 5);
    }

    @Test
    public void testRaiz() throws Exception {
        assertEquals(4, sqrt.raiz(16, 5), 0.001);
    }
}