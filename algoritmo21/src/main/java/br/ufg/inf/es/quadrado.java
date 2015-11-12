package br.ufg.inf.es;

/**
 * Quadrado Perfeito.
 */
public class quadrado {
    /**
     * verifica se o número é um quadrado perfeito;
     * @param k número a ser verificado;
     * @return {@code true} caso k seja um quadrado perfeito;
     *         {@code false} caso contrário;
     * @throws IllegalArgumentException caso a entrada não satisfaça
     * os padrões do código
     * k deve ser maior que zero;
     */
    public static boolean Quadrado(int k) {
        if(k < 1) {
            throw new IllegalArgumentException("Entrada invalida");
        }

        int i = 1;
        int q = 1;

        while (q < k) {
            i = i + 2;
            q = q + i;
        }

        return (q == k);
    }
}
