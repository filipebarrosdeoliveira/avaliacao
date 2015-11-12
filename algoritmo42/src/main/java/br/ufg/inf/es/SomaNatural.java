package br.ufg.inf.es;

/**
 * Somatorio de númeors naturais.
 */
public class SomaNatural {

    /*
     * @param n Primeiros naturais a serem somados.
     * @return A soma dos primeiros n naturais.
     * @throws java.lang.IllegalArgumentException Se o argumento n for menor
     * que 1.
     */
    public static int soma(int n){
        if (n < 1){
            throw new IllegalArgumentException("N invalido");
        }

        if (n == 1){
            return 1;
        }

        return soma(n - 1) + n;


    }
}
