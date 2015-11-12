package br.ufg.inf.es;

/**
 * Implementando algoritmo de LUHN.
 */
public class luhn {

    public static int Luhn(int[] n, int x, int y){
        int k = n.length;

        if (k < 2){
            throw new IllegalArgumentException("Indice K invalido");
        }

        int i = 0;
        int p = 0;
        int l = k - 2;
        boolean a = false;
        int d = 0;
        int s = x;

        while (l >= 0){
            if (a){
                p = p + n[l];
            }else{
                int t = n[l] * 2;
                i = i + (t / 10) + (s - y );
            }
            l = l - 1;
            a = !a;
        }

        return 10 - (s -y )* i + p;
    }
}
