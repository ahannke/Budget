package it.morfoza;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ahann on 02/08/2016.
 */
public class Budget {



    public static void main(String[] args) throws BrakKlientaException {


        List<Destination> allDestinations = new ArrayList<>();
        allDestinations.add(new Destination("Tajlandia", 215, 6500));
        allDestinations.add(new Destination("Białoruś", 59, 800));
        allDestinations.add(new Destination("Kanary", 249, 2800));

        PaniZBiuraPodrozy milaPaniZBiura = new PaniZBiuraPodrozy(allDestinations);

        milaPaniZBiura.zrobWywiad();

      //  showAffordableDestinations(dailyBudget);

    }

    public static void showAffordableDestinations(double dailyBudget) {
        List<Destination> allDestinations = new ArrayList<>();
        allDestinations.add(new Destination("Tajlandia", 215, 6500));
        allDestinations.add(new Destination("Białoruś", 59, 800));
        allDestinations.add(new Destination("Kanary", 249, 2800));

        List<Destination> affordableDestinations = getAffordableDestinations(allDestinations, dailyBudget);
        System.out.println("Oto lista wszystkich  destynacji: " + allDestinations);
        System.out.println("Oto lista destynacji na ktore Cię stac:" + affordableDestinations);
    }

    public static List<Destination> getAffordableDestinations(List<Destination> destinations, double dailyBudget){

       List<Destination> affordableDestinations = new LinkedList<>();

//       affordableDestinations.add(new Destination("Tajlandia", 215, 6500));
//       affordableDestinations.add(new Destination("Białoruś", 59, 800));
//       affordableDestinations.add(new Destination("Kanary", 249, 2800));

        for (Destination destination : destinations){
            if (destination.pricePerDay<=dailyBudget) {
                affordableDestinations.add(destination);
            }
        }

        return affordableDestinations;



    }



}