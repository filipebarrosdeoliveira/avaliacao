package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Mod.mod(0, 5);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(2, Mod.mod(5, 3));
        assertEquals(0, Mod.mod(6, 3));
    }
}