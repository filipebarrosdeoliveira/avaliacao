package br.ufg.inf.es;

/**
 *PI
 */
public class pi {
    /**
     * calcula pi.
     * @param n = pi;
     * @return o valor de pi;
     * @throws java.lang.IllegalArgumentException caso a entrada não esteja
     * dentro dos padrões pré-definidos:
     *  n deve ser maior que 0;
     */
    public static double Pi(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N invalido");
        }

        int i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        while (i <= n) {
            d = d + 2;
            s = s * -1;
            p = p + ((4 * s) / d);
            i = i + 1;
        }

        return p;
    }
}
