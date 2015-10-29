package br.ufg.inf.es;

import org.junit.Assert;
import org.junit.Test;


public class ParidadeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testt1Invalido() throws Exception {
        Paridade.paridade(-1);
    }

    @Test
    public void TestParidade() throws Exception {
        Assert.assertTrue(Paridade.paridade(2));
    }

}