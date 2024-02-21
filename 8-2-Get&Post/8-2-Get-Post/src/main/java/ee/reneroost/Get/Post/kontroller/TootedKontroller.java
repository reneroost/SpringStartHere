package ee.reneroost.Get.Post.kontroller;

import ee.reneroost.Get.Post.mudel.Toode;
import ee.reneroost.Get.Post.teenus.ToodeTeenus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TootedKontroller {

    private final ToodeTeenus toodeTeenus;

    public TootedKontroller(ToodeTeenus toodeTeenus) {
        this.toodeTeenus = toodeTeenus;
    }

    @GetMapping("/tooted")
    public String vaataTooteid(Model mudel) {
        var tooted = toodeTeenus.leiaKõik();
        mudel.addAttribute("tooted", tooted);

        return "tooted.html";
    }

    @PostMapping(path = "/tooted")
    public String lisaToode(
            @RequestParam String nimi,
            @RequestParam double hind,
            Model mudel) {
        Toode t = new Toode();
        t.setNimi(nimi);
        t.setHind(hind);
        toodeTeenus.lisaToode(t);

        var tooted = toodeTeenus.leiaKõik();
        mudel.addAttribute("tooted", tooted);

        return "tooted.html";
    }

}
