package br.ufg.inf.es;

/**
 * Maximo Divisor Comum.
 */
public class mdc {

    public static int MDC(int a, int b){
        if(a < b){
            throw new IllegalArgumentException("Parametro A invalido");
        }

        if(b <= 0){
            throw new IllegalArgumentException("Parametro B invalido");
        }

        while (b != 0){
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}
