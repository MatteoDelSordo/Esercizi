package RicercaElemento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class RicercaConArray {

    public void getIndexTrova(int[] numbers,
                              int k) {
        int contatore = 0;
        for (int i : numbers) {
            if (i != k) {

                System.out.println("Il valore " + k + " non è presente nella posizione " + contatore + " dell array ");
                contatore++;
            } else {
                System.out.println("Il valore " + k + " è presente nella posizione " + contatore + " dell array ");
            }


        }


    }

    public int getIndexTrovaV2(int[] numbers,
                               int k) {
        int contatore = 0;

        for (int i : numbers) {
            if (i == k) {
                return contatore;
            } else if (i != k) {
                contatore++;

            }

        }
        return -1;

    }


    public int getIndexConList(ArrayList<Integer> list,
                               int k) {
        if (k < list.indexOf(0) && k > list.indexOf(-1)) {
            for (Integer i : list) {
                if (i == k) {
                    return list.lastIndexOf(k);
                }

            }


        }
        return -1;
    }
}
