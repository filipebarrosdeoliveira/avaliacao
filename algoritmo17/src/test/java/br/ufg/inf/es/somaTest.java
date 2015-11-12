package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class somaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        soma.fat(0);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(1, soma.fat(1));

    }

}