package br.ufg.inf.es;

import org.junit.Test;

public class somaFatTest {

    @Test (expected = IllegalArgumentException.class)
    public void testPropriedade() throws Exception {
        somaFat.prop();
    }
}