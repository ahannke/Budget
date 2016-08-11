package it.morfoza;

import java.util.List;

public class SuggestedTripsOffer {
    private int dailyBudget;
    private List<Destination> destinations;

    public SuggestedTripsOffer(int dailyBudget, List<Destination> destinations) {
        this.dailyBudget = dailyBudget;
        this.destinations = destinations;
    }

    public int getDailyBudget() {
        return dailyBudget;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }
}
