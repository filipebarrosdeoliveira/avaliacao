package br.ufg.inf.es;

/**
 * Soma Fatorial
 */
public class soma {

    public static int fat(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Parâmetro inválido");
        }

        int i = 2;
        int f = 1;
        int s = 0;
        while (i <= n){
            f =  s = s + f;
            i = i + 1;
        }

        return f;
    }
}
