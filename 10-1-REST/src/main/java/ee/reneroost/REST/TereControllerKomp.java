package ee.reneroost.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TereControllerKomp {

    @GetMapping("/tere")
    public String tere() {
        return "Tere!";
    }

    @GetMapping("/ciao")
    public String ciao() {
        return "Ciao!";
    }
}
