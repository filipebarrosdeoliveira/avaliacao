package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class modTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        mod.Mod(-1, 5);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(2, mod.Mod(7, 5));
    }
}