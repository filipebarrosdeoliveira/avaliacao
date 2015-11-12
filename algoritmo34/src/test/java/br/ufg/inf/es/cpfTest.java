package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class cpfTest {

    @Test
    public void testCpfValido() throws Exception {
        int[] cpf1 = {0, 7, 0, 0, 7, 6, 9, 3, 9, 1, 1, 1};
        assertTrue(cpf.Cpf())
        int[] cpf2 = {0, 4, 6, 4, 5, 0, 7, 1, 8, 1, 5, 3};
        assertTrue(CPF.cpf(cpf2));
    }

    @Test
    public void testCpfInvalido() throws Exception {
        int[] Cpf = {0, 7, 0, 1, 7, 6, 9, 3, 9, 1, 1, 1};
        assertFalse(cpf.Cpf(Cpf));
    }

}