package br.ufg.inf.es;

import org.junit.Test;

public class luhnTest {

    @Test (expected = IllegalArgumentException.class)
    public void testLuhnVetorInvalido() throws Exception {
        int[] n = {1};
        luhn.Luhn(n,0,0);
    }
}