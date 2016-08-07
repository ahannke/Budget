package it.morfoza;

import java.util.List;
import java.util.Scanner;

/**
 * Created by ahann on 02/08/2016.
 */
public class PaniZBiuraPodrozy {

    private String name = "Zuzia";
    private List<Destination> allDestinations;

    public PaniZBiuraPodrozy(List<Destination> allDestinations) {
        this.allDestinations = allDestinations;
    }

    public void zrobWywiad() throws BrakKlientaException {
        System.out.println("Dzień dobry, mam na imię " + name + ".");
        Scanner input = new Scanner(System.in);

        double number1;
        double number2;

        System.out.println("Ile masz hajsu na wakacje? (podaj w PLN)");
        number1 = input.nextInt();

        if (number1 <= 0) {
            throw new BrakKlientaException();
        }

        System.out.println("Na ile dni chcesz wyjechać?");
        number2 = input.nextInt();

        double dailyBudget = number1 / number2;
        System.out.println("Twój dzienny budżet to: " + dailyBudget);

        // sprawdz ktna ore oferty z listy stac klienta

        // pokaz te oferty


    }

}
