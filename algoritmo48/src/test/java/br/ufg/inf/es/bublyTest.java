package br.ufg.inf.es;

import org.junit.Test;

public class bublyTest {

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhoVetorInvalido() throws Exception {
        int[] a = new int[3];
        bubly.bubleSort(a, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testEntradaNInvalida() throws Exception {
        int[] a = new int[5];
        bubly.bubleSort(a, -5);
    }


}