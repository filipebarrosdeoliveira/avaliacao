package br.ufg.inf;

import org.junit.Test;

import static org.junit.Assert.*;

public class numerosTest {

    @Test (expected = IllegalArgumentException.class)
    public void testNInvalido() throws Exception {
        numeros.amigos(0, 5);
    }

    @Test
    public void testNaoAmigos() throws Exception {
        assertEquals('F', numeros.amigos(40, 53));
    }

    @Test
    public void testAmigos() throws Exception {
        assertEquals('V', numeros.amigos(1, 1));
    }
}