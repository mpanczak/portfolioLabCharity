package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.InstitutionService;

@Controller
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;

    public DonationController(CategoryService categoryService, InstitutionService institutionService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
    }

    @GetMapping("/donation")
    public String donationForm(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("institutions", institutionService.fetchInstitutions());
        model.addAttribute("donation", new Donation());
        return "donation";
    }
}
