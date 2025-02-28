package EsecizioTotalizzabile;

import java.util.List;

public class SequenzaDiInteri implements Totalizzable {

    List<Integer> lista;
    int totale;

    public SequenzaDiInteri(List<Integer> lista) {
        this.lista = lista;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    @Override
    public int getTotale() {
        for (Integer i : lista) {
            this.totale = totale + i;
        }
        return totale;
    }

    public void setTotale(int totale) {
        this.totale = totale;
    }
}
