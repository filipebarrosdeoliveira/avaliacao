package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;


public class arrayTest {

    @Test
    public void testImprime() throws Exception {
        char[] A = {'5', '7', 'B', '6', '8', 'J', 'S', '4'};
        array.inverte(A, 8);
    }

}
