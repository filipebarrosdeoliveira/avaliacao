package br.ufg.inf.es;

import org.junit.Test;

import static org.junit.Assert.*;

public class fibonacciTest {

        @Test (expected = IllegalArgumentException.class)
        public void testParametroInvalido() throws Exception {
            fibonacci.Fib(-1);
        }

        @Test
        public void testFibonacci() throws Exception {
            assertEquals(0, fibonacci.Fib(0));
            assertEquals(1, fibonacci.Fib(1));
            assertEquals(1, fibonacci.Fib(2));
            assertEquals(5, fibonacci.Fib(5));

        }

}