package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;

public class logaritmoTest {

    @Test (expected = IllegalArgumentException.class)
    public void testAInvalido() throws Exception {
        logaritmo.log(0, 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testBInvalido() throws Exception {
        logaritmo.log(1, 1);
    }

    @Test
    public void testLog() throws Exception {
        assertEquals(2.5, logaritmo.log(1, 2), 0.1);
    }

}