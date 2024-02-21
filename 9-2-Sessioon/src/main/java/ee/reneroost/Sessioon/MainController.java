package ee.reneroost.Sessioon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }


    @GetMapping("/peamine")
    public String home(@RequestParam(required = false) String logout, Model model) {

        if (logout != null) {
            loggedUserManagementService.setKasutajanimi(null);
        }

        String kasutajanimi = loggedUserManagementService.getKasutajanimi();

        if (kasutajanimi == null) {
            return "redirect:/";
        }

        model.addAttribute("kasutajanimi", kasutajanimi);
        return "peamine.html";
    }


}
