package br.ufg.inf.es;

/**
 * Divisão.
 */
public class divisão {

    /**
     * Verifica o máximo divisor comum.
     * @param a inteiro 1;
     * @param b inteiro 2;
     * @return o MDC relacionado a esses inteiros;
     * @throws IllegalArgumentException Caso seja definido algum parâmetro
     *         de entrada inválido:
     *         - a deve ser maior ou igual a b.
     *         - b deve ser maior que zero.
     */
    public static int Divisao(int a, int b){
        if (a < b){
            throw new IllegalArgumentException("Parâmetro A inválido");
        }

        if(b <= 0){
            throw new IllegalArgumentException("Parâmetro B inválido");
        }

        while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }
}
