package EsecizioTotalizzabile;

import EsecizioTotalizzabile.eccezioni.EccezioneCustom;

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
    public int getTotale() {
        int somma = 0;
        try {


            for (String s : list) {
                somma += Integer.parseInt(s);
            }
            return somma;
        } catch (EccezioneCustom e) {

        }
        return somma;
    }
}
