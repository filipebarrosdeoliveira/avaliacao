package br.ufg.inf.es;

/**
 * Algoritmo de Horner (multiplicação alinhada)
 */

public class horner {

    /**
     * @param x inteiro;
     * @param g índice do vetor;
     * @param a vetor;
     * @return o resultado do polinomio;
     * @throws IllegalArgumentException caso os parâmetros de entrada sejam inválidos:
     * caso g seja menor que 1;
     * caso o tamanho do vetor a seja menor que g + 1;
     */

    public static int Horner(int x, int g, int[] a){
        if (g < 1){
            throw new IllegalArgumentException("G menor que 1");
        }

        if (a.length < g + 1){
            throw new IllegalArgumentException("Tamanho de vetor invalido");
        }

        int p = a[g];
        int i = g - 1;

        while (i >= 0) {
            p = p * x + a[i];
            i = i - 1;
        }

        return p;
    }
}


