package br.ufg.inf.es;


public class Div {

    public static void div(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a ou b inválido");
        }






        int i = 1;
            int s = 0;
            while (i <= b) {
                s = s + a;
                i = i + 1;
            }


    }
}
