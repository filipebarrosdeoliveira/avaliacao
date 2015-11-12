package br.ufg.inf.es;

import org.junit.Test;

public class logTest {

    @Test (expected = IllegalArgumentException.class)
    public void testAInvalido() throws Exception {
        log.Log(0, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testBInvalido() throws Exception {
        log.Log(1, 1);
    }


}