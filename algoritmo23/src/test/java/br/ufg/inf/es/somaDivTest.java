package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;

public class somaDivTest {

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaInvalida() throws Exception {
        somaDiv.soma(0);
    }

    @Test
    public void testSomaDosDivisores() throws Exception {
        assertEquals(6, somaDiv.soma(25));
    }

}