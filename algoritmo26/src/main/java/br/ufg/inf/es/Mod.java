package br.ufg.inf.es;

/**
 *  Retorna o resto da divisão de dois inteiros
 */
public class Mod {

    /**
     * retorna o resto da divisão entre x e y;
     * @param x dividendo;
     * @param y divisor;
     * @return resto da divisão;
     * @throws IllegalArgumentException caso os parametros de entrada sejam
     * invalidos:
     * x > 0;
     * y > 0;
     */

    public static int mod(int x, int y){
        if (x <= 0 || y <= 0){
            throw new IllegalArgumentException("x e y devem ser inteiros positivos");
        }

        int d = 0;
        int s = x;

        while (s >= y) {
            s = s - y;
            d = d + 1;
        }
        return x - (d * y);
    }
}
