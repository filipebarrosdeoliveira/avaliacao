package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;


public class paridade153Test {

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaNegativa() throws Exception {
        paridade153.propriedade(-10);
    }

    @Test
    public void testVerdadeiro() throws Exception {
        assertTrue(paridade153.propriedade(153));
    }

    @Test
    public void testFalsos() throws Exception {
        assertFalse(paridade153.propriedade(154));
    }
}