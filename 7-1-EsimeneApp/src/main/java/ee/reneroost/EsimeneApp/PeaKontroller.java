package ee.reneroost.EsimeneApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeaKontroller {

    @RequestMapping("/kodu")
    public String kodu() {
        return "kodu.html";
    }
}
