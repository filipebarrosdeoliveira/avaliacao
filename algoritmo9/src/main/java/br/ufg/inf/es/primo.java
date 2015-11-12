package br.ufg.inf.es;

/**
 * Verifica se o número é primo ou não.
 */
public class primo {

    /**
     * verifica se um dado inteiro é primo ou não;
     * @param n inteiro a ser verificado.
     * @return {@code true}.
     *         {@code false}.
     * @throws IllegalArgumentException caso a entrada
     *         seja um inteiro menor que 2.
     */
    public static boolean Primo(int n){
        if (n <= 1){
            throw new IllegalArgumentException("N menor que 1");
        }

        int i = 2;

        while (i <= (n - 1)){
            if (n % i == 0){
                return false;
            }

            i = i + 1;
        }

        return true;
    }
}
