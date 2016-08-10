package it.morfoza;

import java.util.ArrayList;
import java.util.List;


public class BudgetConsole {

    public static void budgetConsole(String[] args) throws BrakKlientaException {

        List<Destination> allDestinations = new ArrayList<>();
        allDestinations.add(new Destination("Tajlandia", 215, 6500));
        allDestinations.add(new Destination("Białoruś", 59, 800));
        allDestinations.add(new Destination("Kanary", 249, 2800));

        PaniZBiuraPodrozy milaPaniZBiura = new PaniZBiuraPodrozy(allDestinations);

        milaPaniZBiura.zrobWywiad();
    }

}