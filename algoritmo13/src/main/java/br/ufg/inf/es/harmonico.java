package br.ufg.inf.es;

/**
 * Série harmonica.
 */
public class harmonico {

    public static double Harmonico(int n){
        if (n < 1){
            throw new IllegalArgumentException("N menor que 1");
        }

        double i = 2;
        double s = 1;

        while (i <= n){
            s = s + (1 / i);
            i = i + 1;
        }

        return s;
    }
}
