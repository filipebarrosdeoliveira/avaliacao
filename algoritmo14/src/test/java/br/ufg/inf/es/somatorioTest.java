package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;


public class somatorioTest {

        @Test (expected = IllegalArgumentException.class)
        public void testEntradaInvalida() throws Exception {
            somatorio.Somatorio((0));
        }

        @Test
        public void testSomatorio2() throws Exception {
            assertEquals(0.7,somatorio.Somatorio(2), 0.01);
        }

        @Test
        public void testSomatorio20() throws Exception {
            assertEquals(1.027, somatorio.Somatorio(20), 0.001);
        }

        @Test
        public void testSomatorio1000() throws Exception {
            assertEquals(1.07568, somatorio.Somatorio(1000), 0.0001);
        }
}