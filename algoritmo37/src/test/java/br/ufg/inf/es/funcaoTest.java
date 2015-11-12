package br.ufg.inf.es;

import junit.framework.TestCase;
import org.junit.Test;

public class funcaoTest extends TestCase {


    @Test
    public void testFuncao() throws Exception {
        assertEquals(1, funcao.Funcao(0, 0));
    }
}