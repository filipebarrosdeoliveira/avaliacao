package br.ufg.inf.es.construcao;

import org.junit.*;


public class RazaoAureaTest {

    @Test (expected = IllegalArgumentException.class)
    public void testt1Invalido() throws Exception {
        RazaoAurea.razaoAurea(0,7,9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testt2Invalido() throws  Exception{
        RazaoAurea.razaoAurea(1,-1,2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testfatorInvalido() throws Exception {
        RazaoAurea.razaoAurea(1,1,-1);
    }

    @Test
    public void testRazaoAurea() throws Exception {
        Assert.assertEquals(1.61803399d, RazaoAurea.razaoAurea(2,6,1000), 0.00001d);

    }

}
