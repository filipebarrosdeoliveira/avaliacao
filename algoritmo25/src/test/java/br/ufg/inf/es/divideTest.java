package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;
public class divideTest {

    @Test (expected = IllegalArgumentException.class)
    public void testXInvalido() throws Exception {
        divide.sub(-1, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testYInvalido() throws Exception {
        divide.sub(5, 0);
    }

    @Test
    public void test() throws Exception {
        assertEquals(100, divide.sub(200, 2));
    }

}