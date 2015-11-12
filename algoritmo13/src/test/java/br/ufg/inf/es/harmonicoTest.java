package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;


public class harmonicoTest {

        @Test (expected = IllegalArgumentException.class)
        public void testInvalido() throws Exception {
            harmonico.Harmonico(0);
        }

        @Test
        public void testHarmonico10() throws Exception {
            assertEquals(2.928968, harmonico.Harmonico(10), 0.001);
        }
}