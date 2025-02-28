package FizzBuzz;

import java.util.Scanner;

public class FizzBuzzClass {
    public void fizzBuzz(int n) {

        System.out.println(
                "Ciao, dammi un numero da processare \n Se il numero è un multiplo sia di 3 che di 5 verra stampato " + "\"FizzBuzz\" \n Se il numero è multiplo di 3 ma non di 5 stamperò \"fizz\" \n Se il numero è" + " multiplo solo di 3 ma non di 5 stampero \"Buzz\" \n Se non è multiplo di nessuno dei due " + "stampero semplicemente il numero. \n Iniziamo");


        for (int i = 1;
             i <= n;
             i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 != 0) {
                //dato che controllo gia sopra che sono divisibili per 5 e per 3 ho pensato che
                //potessi saltare un controllo, a funzionare funziona, ho provato con diversi numeri e va, non so se
                // puo esserci qualche caso in cui si rompe tutto, in caso io non l'ho trovata
                System.out.println("Fizz");
            } else if (i % 3 != 0) {
                System.out.println("Buzz");

            }


        }

    }
}
