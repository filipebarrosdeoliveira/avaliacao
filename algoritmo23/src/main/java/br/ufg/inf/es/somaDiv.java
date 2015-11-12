package br.ufg.inf.es;

/**
 * Soma Divisor.
 */
public class somaDiv {

    public static int soma(int n) {
        if (n <= 0){
            throw new IllegalArgumentException("N invalido");
        }

        int d = 2;
        int s = 1;

        while (d <= (n / 2)){
            if(n%d == 0){
                s = s + d;
            }

            d = d + 1;
        }

        return s;
    }
}
