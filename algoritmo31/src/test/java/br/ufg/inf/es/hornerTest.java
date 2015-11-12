package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class hornerTest {

    @Test (expected = IllegalArgumentException.class)
    public void testGInvalido() throws Exception {
        int[] vetor = {1, 2, 3, 4};
        horner.Horner(0, 0, vetor);
    }

    @Test
    public void testHorner() throws Exception {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(86, horner.Horner(5, 2, vetor));
        assertEquals(49, horner.Horner(2, 3, vetor));
    }

}