package br.ufg.inf.es;


import org.junit.Test;
import static org.junit.Assert.*;

public class fatorialTest {

    @Test (expected = IllegalArgumentException.class)
    public void testNInvalido() throws Exception {
        fatorial.Fat(0);
    }

    @Test
    public void testFatoriais() throws Exception {
        assertEquals(1, fatorial.Fat(1));
        assertEquals(2, fatorial.Fat(2));
        assertEquals(6, fatorial.Fat(3));
    }

}