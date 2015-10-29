package br.ufg.inf.es.construcao.produto;

import org.junit.*;


public class ProdutoTest {



    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Produto.produto(-1, 10);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testsegundoParametroInvalido() throws Exception {
        Produto.produto(1, -10);
    }

}