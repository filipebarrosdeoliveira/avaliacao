package br.ufg.inf.es;

import org.junit.Test;
import org.junit.Assert;


public class propriedadeTest {

    @Test (expected = IllegalArgumentException.class)
    public void testMenorInvalido() throws Exception {
        propriedade.Propriedade(-20);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMaiorInvalido() throws Exception {
        propriedade.Propriedade(20);
    }

    @Test
    public void testFalsos() throws Exception {
        Assert.assertFalse(propriedade.Propriedade(2000));
    }

    @Test
    public void testCasosVerdadeiros() throws Exception {
        Assert.assertTrue(propriedade.Propriedade(2025));
    }


}