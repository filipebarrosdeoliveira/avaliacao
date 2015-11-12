package br.ufg.inf.es;

import junit.framework.TestCase;
import org.junit.Test;


public class crivoTest extends TestCase {

    @Test
    public void testCrivoEratostenes() throws Exception {
        int[] vetor = new int[601];
        int n = 600;

        crivo.Crivo(vetor, n);

        assertEquals(0, vetor[2]);
    }

}