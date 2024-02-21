package ee.reneroost.Sessioon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    LoginProcessor loginProcessor = new LoginProcessor(new LoggedUserManagementService());

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(
            @RequestParam String kasutajanimi,
            @RequestParam String parool,
            Model mudel
    ) {
        boolean sisseLogitud;

        loginProcessor.setKasutajanimi(kasutajanimi);
        loginProcessor.setParool(parool);

        sisseLogitud = loginProcessor.login();

        if (sisseLogitud) {
            System.out.println("TEST1");
            return "redirect:/peamine";
        }

//        if (sisseLogitud) {
//            mudel.addAttribute("sonum", "Sa oled sisse logitud.");
//        } else {
//            mudel.addAttribute("sonum", "Sisselogimine ebaõnnestus!");
//        }

        mudel.addAttribute("sonum", "Sisselogimine ebaõnnestus!");
        return "login.html";
    }
}