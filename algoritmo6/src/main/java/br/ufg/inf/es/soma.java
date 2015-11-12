package br.ufg.inf.es;

/**
 * Soma de potencias.
 */
public class soma {

    /**
     * realiza a operacao;
     * @param x base da operacao;
     * @param y expoente da operacao;
     * @return o valor da exponenciacao;
     * @throws IllegalArgumentException caso ocorra uma entrada de par�metro
     * inadequado
     * x deve ser um valor maior que 0, inclusive
     * y deve ser um valor maior que 0;
     */
    public static int potencia(int x, int y){
        if (x <= 0 || y < 1){
            throw new IllegalArgumentException("Parametros de entrada invalidos");
        }

        int i = 1;
        int p = x;
        int s = 0;

        while (i < y){
            s = s + x;
            i = i + 1;
        }

        return p;
    }

}
