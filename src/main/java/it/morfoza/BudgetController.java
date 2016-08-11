package it.morfoza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BudgetController {

    private PaniZBiuraPodrozy paniZBiuraPodrozy;

    @Autowired
    public BudgetController(PaniZBiuraPodrozy paniZBiuraPodrozy) {
        this.paniZBiuraPodrozy = paniZBiuraPodrozy;
    }

    @RequestMapping("/wywiad")
    public String wywiad() {
        return "wywiad";
    }

    @RequestMapping("/dailyBudget")
    public String dailyBudget(@RequestParam(value = "number1", defaultValue = "0") Integer totalBudget,
                              @RequestParam(value = "number2", defaultValue = "1") Integer numberOfDays,
                              Model model) {

        SuggestedTripsOffer offer = paniZBiuraPodrozy.getAffordableDestinations(totalBudget, numberOfDays);
        model.addAttribute("offer", offer);

        return "dailyBudget";
    }




}
