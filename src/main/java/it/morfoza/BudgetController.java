package it.morfoza;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BudgetController {

    @RequestMapping("/wywiad")
    public String wywiad() {
        return "wywiad";
    }

    @RequestMapping("/dailyBudget")
    public String dailyBudget(@RequestParam(value = "number1", defaultValue = "0") Integer totalBudget,
                              @RequestParam(value = "number2", defaultValue = "1") Integer numberOfDays,
                              Model model) {
        int dailyBudget = totalBudget / numberOfDays;
        model.addAttribute("dailyBudget", dailyBudget);

        List<Destination> allDestinations = new ArrayList<>();
//        Destination destination = new Destination("", 234, 3500);
        allDestinations.add(new Destination("aaaaaa", 234, 3500));
        PaniZBiuraPodrozy paniZBiuraPodrozy = new PaniZBiuraPodrozy(allDestinations);





        model.addAttribute("affordableDestinations",allDestinations);

        return "dailyBudget";
    }




}
