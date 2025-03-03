package EsecizioTotalizzabile;

import EsecizioTotalizzabile.eccezioni.SequenzaDiInteriException;

import java.util.List;

public class SequenzaDiInteri implements Totalizzable<Integer> {

    List<Integer> lista;
    int totale;

    public SequenzaDiInteri(List<Integer> lista) throws SequenzaDiInteriException {
        if (lista.isEmpty()) {
            throw new SequenzaDiInteriException("La lista è vuota");
        }
        this.lista = lista;
    }

    public List<Integer> getLista() {

        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    @Override
    public int getTotale() throws SequenzaDiInteriException {


        for (Integer i : lista) {
            this.totale = totale + i;
        }
        return totale;
    }

    public void setTotale(int totale) {
        this.totale = totale;
    }
}