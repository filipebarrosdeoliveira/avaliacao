package br.ufg.inf.es;

/**
 * Soma de números naturais
 */
public class somaNatural {

    /**
     * Soma naturais.
     *
     * @param n Primeiros naturais a serem somados.
     * @return A soma dos primeiros n naturais.
     *
     * @throws java.lang.IllegalArgumentException Se o argumento n for menor
     *          que 1.
     */

    public static int soma(int n){
        if (n < 1){
            throw new IllegalArgumentException("Número deve ser maior que zero");
        }

        int i = 2;
        int s = 1;

        while (i <= n){
            s = s + i;
            i = i + 1;
        }

        return s;
    }
}
