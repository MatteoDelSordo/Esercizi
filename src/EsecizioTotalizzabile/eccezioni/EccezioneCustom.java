package EsecizioTotalizzabile.eccezioni;

public class EccezioneCustom extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EccezioneCustom(String messaggio) {
        super(messaggio);
    }

}
