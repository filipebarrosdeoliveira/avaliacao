package br.ufg.inf.es;

/**
 * Paridade 153.
 */
public class paridade153 {
    /**
     * Verifica a existencia da propriedade 153 em um inteiro.
     * @param n Inteiro a ser verificado.
     * @return {@code true}.
     *         {@code false}.
     * n deve ser maior que 0.
     * n deve ser menor que 1000.
     */
    public static boolean propriedade(int n){
        if (n < 0 || n > 999){
            throw new IllegalArgumentException("Parâmetro de entrada invalido");
        }

        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;

        return (i * i * i + j * j * j + k * k * k == n);
    }
}
