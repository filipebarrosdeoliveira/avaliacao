package br.ufg.inf.es;

/**
 * Veirificação de um polinomio.
 */
public class polinomio {


        /**
         * @param x inteiro a ser verificado;
         * @param g índice do vetor;
         * @param a vetor;
         * @return o resultado do polinomio;
         * @throws IllegalArgumentException caso os parâmetros de entrada sejam inválidos:
         * caso g seja menor que 1;
         * caso o tamanho do vetor a seja menor que g + 1;
         * caso o vetor a no índice [g] seja igual a zero;
         */
        public static int pol(int x, int g, int[] a){
            if (g < 1){
                throw new IllegalArgumentException("G menor que 1");
            }

            if (a.length < g + 1){
                throw new IllegalArgumentException("Tamanho de vetor invalido");
            }

            if (a[g] == 0){
                throw new IllegalArgumentException("Vetor invalido");
            }

            int p = a[0];
            int i = 1;
            while (i <= g){
                p = p * x;
                p = p + (a[i] * p);
                i = i + 1;
            }

            return p;
        }
}
