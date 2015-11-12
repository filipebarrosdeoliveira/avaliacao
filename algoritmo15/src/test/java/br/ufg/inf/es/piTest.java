package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;

public class piTest {

        @Test (expected = IllegalArgumentException.class)
        public void testEntradaInvalida() throws Exception {
            pi.Pi(0);
        }

        @Test
        public void testPi10() throws Exception {
            assertEquals(Math.PI, pi.Pi(10), 0.1);
        }

        @Test
        public void testPi50() throws Exception {
            assertEquals(Math.PI, pi.Pi(50), 0.1);
        }

}