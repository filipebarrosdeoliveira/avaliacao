package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;


public class arrayTest {

    @Test
    public void testInverteArrayUmaLetra() throws Exception {
        char[] si = {'a'};
        char[] so = {'a'};
        char[] sa = array.inverte(si);
        assertEquals(so[0], sa[0]);
    }


}