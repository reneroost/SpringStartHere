package ee.reneroost.Login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

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
        boolean sisseLogitud = false;

        LoginProcessor loginProcessor = new LoginProcessor();
        loginProcessor.setKasutajanimi(kasutajanimi);
        loginProcessor.setParool(parool);

        sisseLogitud = loginProcessor.login();

        if (sisseLogitud) {
            mudel.addAttribute("sonum", "Sa oled sisse logitud.");
        } else {
            mudel.addAttribute("sonum", "Sisselogimine ebaõnnestus!");
        }
        System.out.println("TEST1");
        return "login.html";
    }
}