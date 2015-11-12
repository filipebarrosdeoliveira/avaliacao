package br.ufg.inf.es;

import org.junit.Test.*;


public class DivTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Produto.produto(-1, 10);
    }



}