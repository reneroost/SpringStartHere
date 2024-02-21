package ee.reneroost.HttpVastus;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RiikController {

//    @GetMapping("/prantsusmaa")
//    public Riik prantsusmaa() {
//        Riik riik = Riik.riikTehas("Prantsusmaa", 67);
//        return riik;
//    }

    @GetMapping("/kõik")
    public List<Riik> riigid() {
        Riik riik1 = Riik.riikTehas("Prantsusmaa", 67);
        Riik riik2 = Riik.riikTehas("Hispaania", 47);

        return List.of(riik1, riik2);
    }

    @GetMapping("/prantsusmaa")
    public ResponseEntity<Riik> prantsusmaa() {
        Riik riik = Riik.riikTehas("Pransusmaa", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("maailmajagu", "Euroopa")
                .header("pealinn", "Pariis")
                .header("lemmik_toit", "juust ja vein")
                .body(riik);
    }
}
