package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;

public class primoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        primo.Primo(1);
    }

    @Test
    public void testVerdadeiros() throws Exception {
        assertTrue(primo.Primo(2));
    }

    @Test
    public void testFalsos() throws Exception {
        assertFalse(primo.Primo(20));
    }


}