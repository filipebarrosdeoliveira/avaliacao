package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;


public class divideTest {

    @Test (expected = IllegalArgumentException.class)
    public void testXInvalido() throws Exception {
        divide.soma(-6, 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testYInvalido() throws Exception {
        divide.soma(8, 0);
    }

    @Test
    public void test() throws Exception {
        assertEquals(2, divide.soma(5, 2));
    }
}