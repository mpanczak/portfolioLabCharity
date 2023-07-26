package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

@Controller
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    public DonationController(CategoryService categoryService, InstitutionService institutionService, DonationService donationService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @GetMapping("/app/donation/new")
    public String donationForm(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("institutions", institutionService.fetchInstitutions());
        model.addAttribute("donation", new Donation());
        return "donation_form";
    }

    @PostMapping("/app/donation/new")
    public String donationAction(Donation donation) {
        donationService.save(donation);
        return "redirect:/app/donation/confirmation";
    }
}
