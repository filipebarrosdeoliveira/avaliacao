package br.ufg.inf.es;

/**
 * Verifica a validade do CPF pesquisado.
 */
public class cpf {

    /**
     * @param d vetor que contem o CPF;
     * @return {@code true} Caso o CPF informado seja Válido;
     *         {@code false} Caso contrário;
     * @throws IllegalArgumentException Caso o tamanho do vetor seja
     * incompátivel;
     * d.lenght deve ser igual(ou maior)  a doze;
     * os dígitos de índice d[1] a d[11] são os válidos;
     * apenas índices entre 0 e 9 são aceitáveis dentro do vetor;
     */

    public static boolean Cpf(int[] d, int y, int x, int j, int k){
        if(d.length < 12){
            throw new IllegalArgumentException("Tamanho de vetor Invalido");
        }

        for (x = 1; x < 12; x++){
            if(d[x] < 0 || d[x] > 9){
                throw new IllegalArgumentException("Entrada do vetor inválida");
            }
        }

        int sj = 0;
        int sk = 0;
        int i;

        for (i = 1; i < 10; i++){
            sj = sj + (i * d[i]);
        }
        for (i = 2; i < 11; i++){
            sk = sk + ((i - 1) * d[i]);
        }


        /**
         * int sj = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] +
         *        7 * d[7] + 8 * d[8] + 9 * d[9];
         * int sk = d[2] + 2 * d[3] + 3 * d[4] + 4 * d[5] + 5 * d[6] + 6 * d[7] +
         *        7 * d[8] + 8 * d[9] + 9 * d[10];
         */

        int l = 0;
        int s = x;

        while (s >= x) {
            s = s - x;
            l = l + 1;
        }

        return (j == d[10] && k == d[11]);
    }
}
