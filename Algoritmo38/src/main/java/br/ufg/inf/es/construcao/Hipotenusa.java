package br.ufg.inf.es.construcao;

/**
 * Algoritmo de construção da Hipotenusa.
 * Aluno: Filipe Barros de Oliveira.
 * Matéria: Construção de software.
 */
public class Hipotenusa {

    /**
     * Hipotenusa &eacute; soma do quadrado dos catetos.
     *
     * @param A
     * @param B
     * @return r se o valor for hipotenusa.
     * */

    public static int hipotenusa (int A, int B) {
        if (A < 1 || B < 1) {
            throw new IllegalArgumentException("A,B");
        }

        int x = A * A;
        int y = B * B;
        int r = x + y;

        r = (int) Math.sqrt (r);

        return r;


    }



}




