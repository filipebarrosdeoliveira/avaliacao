package br.ufg.inf.es;

/**
 * Created by filipebarros on 11/12/15.
 */
public class log {

    /**
     * verifica log natural;
     * @param n inteiro a ser verificado;
     * @param k grau de precisao;
     * @return log;
     */
    public static double Log(int n, int k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Parametros invalidos");
        }

        int i = 2;
        int f = 1;
        int p = 1;
        double e = n + 1;

        while (i <= k) {

            p = p * n;
            f = f * i;
            e = e + p / f;
            i = i + 1;
        }

        return e;
    }

}
