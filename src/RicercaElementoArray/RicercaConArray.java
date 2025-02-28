package RicercaElementoArray;

import java.util.ArrayList;


public class RicercaConArray {

    /// metodo con array
    public int getIndexTrova(int[] numbers,
                             int k) {
        // Pensando ai modi per velocizzare l'operazione mi è venuto in mente che avrei
        // potuto dividere l'array meta e far controllare prima una parte e poi l'altra
        // che in questo caso visto che l'array era piccolo non cambia molto, ma potrebbe
        // fare la differenza in un contesto piu grande, quindi ho calcolato la meta semplicemente
        // dividendo la lunghezza per due, non so se è il metodo piu corretto
        int inizio = 0;
        int fine = numbers.length - 1;
        int meta = numbers.length / 2;
        // Qui controllo se il valore passato corrisponde con il primo indice o con l'ultimo in modo
        // da evitare di ciclare tutto l'array
        //Ho aggiunto il controllo per inizio e fine anche qui

        if (k >= numbers[inizio] && k <= numbers[fine]) {
            if (k == numbers[inizio]) {
                return 0;
            } else if (k == numbers[fine]) {
                return fine;
            } else if (k > numbers[inizio] && k <= numbers[meta]) { //qui controllo dal secondo indice in poi spostando
                // il valore di i da 0 a 1 ma ora che ci penso potevo farlo anche semplicemente aggiungendo +1 a inizio
                for (int i = 1;
                     i <= meta;
                     i++) {
                    if (numbers[i] == k) {
                        return i;
                    }
                }
            } else if (k > numbers[meta] && k <= numbers[fine]) {//Stessa cosa di sopra ma partendo dalla posizione
                // centrale dell array
                for (int j = meta;
                     j <= numbers[fine];
                     j++) {
                    if (numbers[j] == k) {
                        return j;
                    }
                }
            }
            return -1;
        }
        return inizio;
    }

    public int getIndexConList(ArrayList<Integer> list,
                               int k) {
        // Stesso concetto del metodo con array ma con i metodi che da l'ArrayList
        int meta = list.size() / 2;
        int inizio = 0;
        int fine = list.size() - 1;
        // Qui dato che so che la lista è ordinata controllo subito che il valore passato sia piu grande del primo e
        // piu piccolo dell ultimo e nel caso non sia cosi si esce subito dal metodo
        if (k >= list.getFirst() && k <= list.getLast()) {
            if (k == list.getFirst()) {

                return 0;
            } else if (k == list.getLast()) {

                return list.size() - 1;
            } else if (k <= list.get(meta)) {
                for (int i = 1;
                     i <= list.get(meta);
                     i++) {
                    if (list.get(i) == k) {
                        return i;
                    }
                }
            } else if (k > list.get(meta)) {
                for (int i = meta;
                     i < list.get(fine);
                     i++) {
                    if (list.get(i) == k) {
                        return i;
                    }
                }
            }
            return -1;
        }
        return -1;
    }
}

