package it.morfoza;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



/**
 * Created by ahann on 02/08/2016.
 */
public class Grazynka implements PaniZBiuraPodrozy {

    private String name = "Zuzia";
    private List<Destination> allDestinations;

    double number1;
    double number2;

    public Grazynka(List<Destination> allDestinations) {
        this.allDestinations = allDestinations;
    }


    public void zrobWywiad() throws BrakKlientaException {
        System.out.println("Dzień dobry, mam na imię " + name + ".");
        Scanner input = new Scanner(System.in);

        System.out.println("Ile masz hajsu na wakacje? (podaj w PLN)");
        number1 = input.nextInt();

        if (number1 <= 0) {
            throw new BrakKlientaException();
        }

        System.out.println("Na ile dni chcesz wyjechać?");
        number2 = input.nextInt();

        double dailyBudget = number1 / number2;
        System.out.println("Twój dzienny budżet to: " + dailyBudget);

        // sprawdz na ktore oferty z listy stac klienta

        // pokaz te oferty
        showAffordableDestinations(dailyBudget);
    }


    public void showAffordableDestinations(double dailyBudget) {
        List<Destination> affordableDestinations = getAffordableDestinations(allDestinations, dailyBudget);
        System.out.println("Oto lista wszystkich  destynacji: " + allDestinations);
        System.out.println("Oto lista destynacji na które Cię stać:" + affordableDestinations);

    }

    public List<Destination> getAffordableDestinations(List<Destination> destinations, double dailyBudget) {

        List<Destination> affordableDestinations = new LinkedList<>();
        for (Destination destination : destinations) {
            if (destination.pricePerDay <= dailyBudget) {
                affordableDestinations.add(destination);
            }
        }

        return affordableDestinations;
    }


    @Override
    public SuggestedTripsOffer getAffordableDestinations(int totalBudget, int numberOfDays) {
        int dailyBuget = totalBudget / numberOfDays;
        List<Destination> affordableDestinations = getAffordableDestinations(allDestinations, dailyBuget);
        return new SuggestedTripsOffer(dailyBuget, affordableDestinations);
    }

}
