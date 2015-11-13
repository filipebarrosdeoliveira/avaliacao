package br.ufg.inf.es;

/**
 * Implementação Array.
 */
public class array {

   /**
     * imprime array de caracteres;
     * @param A array a ser impresso;
     * @param n limite do array;
     * @throws IllegalArgumentException caso:
     * n seja menor que 0;
     * n seja maior que o tamanho total do array;
     */
    public static void imprime(char [] A, int n){
        if (n > A.length){
            throw new IllegalArgumentException("Tamanho de vetor Invalido");
        }
        if (n < 0){
            throw new IllegalArgumentException("Parâmetro Invalido");
        }

        int i = 0;
        while (i < n){
            System.out.print(" "+ A[i]);
            i = i + 1;
        }
    }
}
