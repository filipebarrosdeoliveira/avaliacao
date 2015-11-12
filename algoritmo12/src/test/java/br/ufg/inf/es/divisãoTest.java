package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;

public class divisãoTest {

        @Test (expected = IllegalArgumentException.class)
        public void testParametroAInvalido() throws Exception {
            divisão.Divisao(11, 12);
        }

        @Test (expected = IllegalArgumentException.class)
        public void testParametroBInvalido() throws Exception {
            divisão.Divisao(9, 0);
        }

        @Test
        public void testMdc() throws Exception {
            assertEquals(1, divisão.Divisao(5, 4));
        }
}