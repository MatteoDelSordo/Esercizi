package EsecizioTotalizzabile;

import EsecizioTotalizzabile.eccezioni.FraseException;

import java.util.ArrayList;
import java.util.List;

public class Frase implements Totalizzable<String> {

    List<String> list;

    public Frase(List<String> parole) {

        this.list = parole;
    }


    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public int getTotale() throws FraseException {
        int somma = 0;
        try {
            for (String s : list) {
                somma += Integer.parseInt(s);
            }
            return somma;
        } catch (NumberFormatException e) {
           throw  new FraseException("Non sono ammesse lettere");
        }


    }
}
