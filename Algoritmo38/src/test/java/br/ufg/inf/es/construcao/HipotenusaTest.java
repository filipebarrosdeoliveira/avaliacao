package br.ufg.inf.es.construcao;

import org.junit.*;


public class HipotenusaTest {

    @Test
    public void Hipotenusa() throws Exception {

        Assert.assertEquals(5, Hipotenusa.hipotenusa(3, 4));

    }


    @Test
    public void hipotenusa() throws Exception {

        Assert.assertEquals(13, Hipotenusa.hipotenusa(5, 12));

        Assert.assertEquals(80, Hipotenusa.hipotenusa(48, 64));

    }
}