package br.ufg.inf.es.construcao;



public class RazaoAurea {

    public static double razaoAurea(int t1, int t2, int fator) {
        if (t1 <= 0) {
            throw new IllegalArgumentException("t1");
        }

        if (t2 <= t1) {
            throw new IllegalArgumentException("t2 não é maior que t1");
        }

        if (fator <= 0) {
            throw new IllegalArgumentException("Fator");
        }

        double tc = t2;
        double ta = t1;
        int i = 1;

        while (i <= fator) {
            tc = tc + ta;
            ta = tc - ta;
            i = i + 1;
        }

        return tc / ta;
    }
}