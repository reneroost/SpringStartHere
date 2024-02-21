package ee.reneroost.Get.Post.teenus;

import ee.reneroost.Get.Post.mudel.Toode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToodeTeenus {

    private List<Toode> tooted = new ArrayList<>();

    public ToodeTeenus() {
        System.out.println("ToodeTeenus.java konstruktor kutsuti välja.");
    }

    public void lisaToode(Toode t) {
        tooted.add(t);
    }

    public List<Toode> leiaKõik() {
        return tooted;
    }

}
