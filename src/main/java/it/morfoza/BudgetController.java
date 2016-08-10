package it.morfoza;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BudgetController {

    @RequestMapping("/wywiad")
    public String wywiad() {
        return "wywiad";
    }

    @RequestMapping("/dailyBudget")
    public String dailyBudget(@RequestParam(value = "number1", defaultValue = "0") Integer number1,
                              @RequestParam(value = "number2", defaultValue = "1") Integer number2,
                              @RequestParam(value = "affordableDestinations", required = false)
                                          String showDailyBudget, Model model) {
        model.addAttribute("dailyBudget", number1 / number2);

        return "dailyBudget";
    }


}
