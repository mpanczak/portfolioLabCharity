package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Institution;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {


    @RequestMapping("/")
    public String homeAction(Model model){

        List<Institution> institutions = new ArrayList<>();

        Institution i1 = new Institution();
        i1.setName("Dbam o Zdrowie");
        i1.setDescription("Pomoc dzieciom z ubogich rodzin.");

        Institution i2 = new Institution();
        i2.setName("A kogo");
        i2.setDescription("Pomoc wybudzaniu dzieci ze śpiączki.");

        Institution i3 = new Institution();
        i3.setName("Dla dzieci");
        i3.setDescription("Pomoc osobom znajdującym się w trudnej sytuacji życiowej.");

        Institution i4 = new Institution();
        i4.setName("Bez domu");
        i4.setDescription("Pomoc dla osób nie posiadających miejsca zamieszkania");

        Institution i5 = new Institution();
        i5.setName("Do domu");
        i5.setDescription("Pomoc dla osób nie posiadających domu");

        Institution i6 = new Institution();
        i6.setName("Bez budy");
        i6.setDescription("Pomoc dla psów");

        institutions.add(i1);
        institutions.add(i2);
        institutions.add(i3);
        institutions.add(i4);
        institutions.add(i5);
//        institutions.add(i6);

        model.addAttribute("institutions", institutions);
        return "index";
    }
}
