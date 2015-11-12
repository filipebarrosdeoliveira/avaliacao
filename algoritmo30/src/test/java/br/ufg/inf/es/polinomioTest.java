package br.ufg.inf.es;

import org.junit.Test;


public class polinomioTest {

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhoVetorInvalido() throws Exception {
        int[] vetor = {1, 2, 3, 4, 5};
        polinomio.pol(5, 5, vetor);
    }


}