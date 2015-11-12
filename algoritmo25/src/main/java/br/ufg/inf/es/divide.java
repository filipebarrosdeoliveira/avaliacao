package br.ufg.inf.es;

/**
 * Divide Subtrações.
 */
public class divide {

    /**
     * realiza a divisão;
     * @param x dividendo;
     * @param y divisor;
     * @return resultado da divisão;
     * @throws IllegalArgumentException caso os parâmetros de entrada sejam
     * inválidos segundo o algoritmo:
     * x deve ser maior que -1;
     * y deve ser maior que zero;
     */
    public static int sub(int x, int y) {
        if (x < 0){
            throw new IllegalArgumentException("X invalido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("Y invalido");
        }

        int d = 0;
        int s = x;

        while (s >= y){
            s = s - y;
            d = d + 1;
        }

        return d;
    }
}
