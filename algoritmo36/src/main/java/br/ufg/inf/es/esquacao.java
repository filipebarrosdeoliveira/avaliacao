package br.ufg.inf.es;

/**
 * Verifica a equação.
 */
public class esquacao {

    /**
     * verifica as possíveis quantidades.
     * @return a quantidade de soluçoes possíveis para a equacao;
     */

    public static int Equacao(){
        int s = 0; //conta as soluções;
        int x = 1;

        while (x <= 96){
            int y = 1;

            while (y <= 65){
                int z = 1;

                while (z <= 39){
                    int w = 1;

                    while (w <= 28){
                        if (2 * x + 3 * y + 5 * z + 7 * w == 210){
                            s = s + 1;
                        }

                        w = w + 1;
                    }

                    z = z + 1;
                }

                y = y + 1;
            }

            x = x + 1;
        }

        return s;
    }
}
