package br.ufg.inf;

/**
 * Verifica se a soma dos divisores de um inteiro .
 */
public class numeros {

    /**
     * Verifica se a soma dos divisores de um inteiro ;
     * @param n inteiro 1;
     * @param m inteiro 2;
     * @return {@code V} caso a relação seja verdadeira;
     *         {@code F} caso a relação seja falsa;
     */
    public static char amigos(int n, int m) {
        if (n <= 0){
            throw new IllegalArgumentException("N invalido");
        }

        if (m <= 0){
            throw new IllegalArgumentException("M invalido");
        }

        int sn = n;
        int sm = m;

        double i = 1;
        double s = 0;

        while (i <= n) {
            double d = 1 + (i * i);
            s = s + (1 / n);
            i = i + 1;
        }


        if (sn == m && sm == n){
            return 'V';
        }else{
            return 'F';
        }
    }
}
