package EsecizioTotalizzabile;

import java.util.ArrayList;
import java.util.List;

public class TotalizzableDemo {
    public static void main(String[] args) {
        List<Integer>lista = new ArrayList<>();
        lista.add(20);
        lista.add(10);
        lista.add(11);



        SequenzaDiInteri s = new SequenzaDiInteri(lista);
        System.out.println(s.getTotale());




    }
}
