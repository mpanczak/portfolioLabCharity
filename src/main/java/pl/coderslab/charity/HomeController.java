package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.service.InstitutionService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
    private final InstitutionService institutionService;

    public HomeController(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }


    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("institutions", institutionService.fetchInstitutions());
        return "index";
    }
}
