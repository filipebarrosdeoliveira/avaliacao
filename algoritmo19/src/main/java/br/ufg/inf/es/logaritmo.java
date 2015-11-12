package br.ufg.inf.es;

/**
 * Logaritmo
 */
public class logaritmo {

    /**
     * verifica log natural;
     * @param n número verificado;
     * @param k grau de precisição;
     * @return log;
     * @throws IllegalArgumentException caso um ou mais parâmetros de entrada
     * sejam inválidos:
     * n maior que 0;
     * k maior que 1;
     */
    public static double log(double n, double k){
        if (n < 1) {
            throw new IllegalArgumentException("N invalido");
        }

        if (k < 2) {
            throw new IllegalArgumentException("K invalido");
        }

        double i = 2;
        double e = n + 1;
        double t = n;

        while (i <= k){
            t = ((t * n) / i);
            e = e + t;
            i = i + 1;
        }

        return e;
    }
}
