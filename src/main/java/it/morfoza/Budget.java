package it.morfoza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ahann on 02/08/2016.
 */
public class Budget {



    public static void main(String[] args) throws BrakKlientaException {


        PaniZBiuraPodrozy milaPaniZBiura = new PaniZBiuraPodrozy();

//        Destination wymarzoneMiejsce = new Destination();
//        wymarzoneMiejsce.name = "Honolulu";
//        wymarzoneMiejsce.pricePerDay = 459;
//        wymarzoneMiejsce.howFar = 8500;

//        milaPaniZBiura.chlamDoOpchniecia = wymarzoneMiejsce;

//        public List<Destination> getAffordableDestination List<Destination> destinations;
//        (List <Destination> destinations) {
//            destinations = new ArrayList<>();
//            for (Destination destination : destinations) {
//                if (.dailyBudget >= destination.pricePerDay); Destination affordableDestination;
//                {
//                    affordableDestination.add(destination);
//
//                }
//                return affordableDestination;
//            }



        List<Destination> sraka = new ArrayList<>();


        sraka.add(new Destination("Tajlandia", 215, 6500));
        sraka.add(new Destination("Białoruś", 59, 800));
        sraka.add(new Destination("Kanary", 249, 2800));

        getAffordableDestinations(sraka, 230);

//        int dupa = 1;
//        milaPaniZBiura.zrobWywiad();
//        dupa = 2;
//        milaPaniZBiura.zrobWywiad();
//        dupa = 3;
//        milaPaniZBiura.zrobWywiad();
//        System.out.println(wymarzoneMiejsce);
    }

   public static List<Destination> getAffordableDestinations(List<Destination> destinations, double dailyBuget){

        for (Destination destination : destinations){
            if (destination.pricePerDay<=dailyBuget) {
                System.out.println(destination);
            }
        }

        return null;

    }



}