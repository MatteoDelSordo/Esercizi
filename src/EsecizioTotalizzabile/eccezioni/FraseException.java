package EsecizioTotalizzabile.eccezioni;

import EsecizioTotalizzabile.Frase;

public class FraseException extends Exception{

    public FraseException (String messaggio){
        super(messaggio);
    }
}
