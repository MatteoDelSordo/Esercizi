package EsecizioTotalizzabile;

import EsecizioTotalizzabile.eccezioni.FraseException;
import EsecizioTotalizzabile.eccezioni.SequenzaDiInteriException;

import java.io.Serializable;
import java.util.List;

public interface Totalizzable<T>  {

public int getTotale() throws SequenzaDiInteriException, FraseException;



}
