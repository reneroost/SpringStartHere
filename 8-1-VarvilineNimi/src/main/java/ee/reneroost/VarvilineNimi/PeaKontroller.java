package ee.reneroost.VarvilineNimi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeaKontroller {

    @RequestMapping("/kodu")
    public String kodu(@RequestParam(required = false) String nimi,
                       @RequestParam(required = false) String värv,
                       Model leht) {
        leht.addAttribute("kasutajanimi", nimi);
        leht.addAttribute("värv", värv);
        return "kodu.html";
    }
}
