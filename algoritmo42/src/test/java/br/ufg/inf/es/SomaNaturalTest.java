package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomaNaturalTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        SomaNatural.soma(-2);
    }

    @Test
    public void testSomatorio10() throws Exception {
        int s = 10;
        int n = SomaNatural.soma(s);
        assertEquals((s * (s + 1) / 2), n);
    }
}