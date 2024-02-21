package ee.reneroost.AndmeAllikasJDBC;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ost")
public class OstController {

    private final OstRepository ostRepository;

    public OstController(
            OstRepository ostRepository) {
        this.ostRepository = ostRepository;
    }

    @PostMapping
    public void hoiustaOsst(@RequestBody Ost ost) {
        ostRepository.hoiustaOst(ost);
    }

    @GetMapping
    public List<Ost> leiaOstud() {
        return ostRepository.leiaKoikOstud();
    }
}
