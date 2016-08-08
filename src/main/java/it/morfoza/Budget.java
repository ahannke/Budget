package it.morfoza;

import java.util.ArrayList;
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


    }




}