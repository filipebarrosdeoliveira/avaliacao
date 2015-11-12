package br.ufg.inf.es;

/**
 * Verifica o resto da divisão.
 */
public class mod {

    public static int Mod(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("X invalido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("Y invalido");
        }

        int s = x;

        while(s >= y) {
            s = s - y;
        }

        return s;
    }
}
