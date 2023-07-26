package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfirmationController {

    @RequestMapping("/app/donation/confirmation")
    public String showConfirmation() {
        return "confirmation";
    }
}
