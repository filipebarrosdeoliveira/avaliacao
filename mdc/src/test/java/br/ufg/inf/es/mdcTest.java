package br.ufg.inf.es;

import org.junit.Test;
import static org.junit.Assert.*;


public class mdcTest {


        @Test (expected = IllegalArgumentException.class)
        public void testParametroAInvalido() throws Exception {
            mdc.MDC(0, 2);
        }

        @Test (expected = IllegalArgumentException.class)
        public void testParametroBInvalido() throws Exception {
            mdc.MDC(2, 0);
        }

        @Test
        public void testMdc() throws Exception {
            assertEquals(1, mdc.MDC(5, 4));
        }


}