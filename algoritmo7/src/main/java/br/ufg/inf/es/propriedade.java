package br.ufg.inf.es;

/**
 * Propriedade 3025.
 */
public class propriedade {

    public static boolean Propriedade(int n){
        if (n < 0 || n > 9999){
            throw new IllegalArgumentException("Parâmetro de entrada inválido");
        }

        int i = n / 100;
        int j = n % 100;

        return ((i + j) * (i + j) == n);
    }
}
