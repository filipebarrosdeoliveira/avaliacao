package br.ufg.inf.es;

import org.junit.*;

public class somaNaturalTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        somaNatural.soma(-11);
    }

    @Test
    public void testSomatorio1000() throws Exception {
        int s = 1000;
        int n = somaNatural.soma(s);

        Assert.assertEquals((s * (s + 1)/2), n);
    }
}