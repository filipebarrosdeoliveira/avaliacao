package br.ufg.inf.es;

/**
 * Verificar a soma Fatorial.
 */
public class somaFat {

    /**
     * verifica a propriedade;
     * @return quantidade de números que atendem a propriedade;
     */
    public static int prop(){
        int t = 0;
        int n = 0;
        int i = 2;
        int f = 1;
        int s = 0;

        while (n < 1000){
            f =  s = s + f;
            i = i + 1;
            t = t + 1;
        }


        n = n + 1;


        return t;
    }
}

