import RicercaElementoArray.Cliente;

import java.util.*;


public class EsercizioComparable {

    public static void main(String[] args) {


        Cliente c1 = new Cliente(65, new Date(), "FrancoCalvo", "Franco", "Calvo");
        Cliente c2 = new Cliente(90, new Date(), "ItaloCalvino", "Italo", "Calvino");
        Cliente c3 = new Cliente(21, new Date(), "PippoFranco", "Pippo", "Franco");

        List<Cliente> listaClienti = new ArrayList<>();

        listaClienti.add(c1);
        listaClienti.add(c2);
        listaClienti.add(c3);

        Collections.sort(listaClienti);

        for (Cliente cliente : listaClienti) {
            System.out.println(cliente);
        }


    }


}
