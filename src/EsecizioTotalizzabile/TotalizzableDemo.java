package EsecizioTotalizzabile;

import EsecizioTotalizzabile.eccezioni.FraseException;
import EsecizioTotalizzabile.eccezioni.SequenzaDiInteriException;

import java.util.ArrayList;
import java.util.List;

public class TotalizzableDemo {
    public static void main(String[] args) throws SequenzaDiInteriException, FraseException {
        List<Integer> lista = new ArrayList<>();
        lista.add(20);
        lista.add(10);
        lista.add(11);


        List<String> parole = new ArrayList<>();

        parole.add("10i");
        parole.add("10");
        parole.add("10");

        SequenzaDiInteri s = new SequenzaDiInteri(lista);
        System.out.println(s.getTotale());

        Frase f = new Frase(parole);
        try {
            System.out.println(f.getTotale());
        } catch (FraseException fe) {
            System.out.println("Non sono ammesse lettere");
        }


    }
}
