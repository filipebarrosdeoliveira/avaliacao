package br.ufg.inf.es;

/**
 * Created by filipebarros on 10/29/15.
 */
public class Paridade {

    public static boolean paridade (int n){

        if (n<0){
            throw new IllegalArgumentException("n");
        }

        if (n % 2 == 0){
            return true;
        }

        else {
            return false;
        }
    }
}
