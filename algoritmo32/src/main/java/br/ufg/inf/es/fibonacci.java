package br.ufg.inf.es;

/**
 * Implementação da senquência de Fibonacci.
 */
public class fibonacci {

    /**
     * verifica Fib[n];
     * @param n verificar o inteiro;
     * @return o valor do Fibonacci de n;
     * @throws IllegalArgumentException caso o parâmetro de
     * entrada seja inválido:
     * n >= 0;
     */

    public static int Fib(int n) {
        if (n < 0){
            throw new IllegalArgumentException("Parametro Invalido");
        }

        int a = 0;
        int c = 1;

        if (n == 0 || n == 1){
            return n;
        }
        int i = 2;

        while (i <= n){
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }
}
