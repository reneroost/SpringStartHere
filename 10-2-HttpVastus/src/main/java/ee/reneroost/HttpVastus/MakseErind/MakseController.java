package ee.reneroost.HttpVastus.MakseErind;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MakseController {

    private final MakseService makseService;
    private static Logger logger = Logger.getLogger(MakseController.class.getName());

    public MakseController(MakseService makseService) {
        this.makseService = makseService;
    }

    @PostMapping("/makse")
    public ResponseEntity<?> sooritaMakse() {
        try {
            MakseDetailid makseDetailid =
                    makseService.tootleMakset();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(makseDetailid);
        } catch (PolePiisavaltRahaErind e) {
            VeaDetailid veaDetailid = new VeaDetailid();
            veaDetailid.setSonum("Makse sooritamiseks pole piisavalt raha.");
            return ResponseEntity
                    .badRequest()
                    .body(veaDetailid);
        }
    }

    @PostMapping("/makse2")
    public ResponseEntity<MakseDetailid> sooritaMakse2() {
        MakseDetailid makseDetailid = makseService.tootleMakset();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(makseDetailid);
    }

    @PostMapping("/makse3")
    public ResponseEntity<MakseDetailid> sooritaMakse3(
            @RequestBody MakseDetailid makseDetailid) {
        logger.info("Sain summa " + makseDetailid.getSumma());

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(makseDetailid);
    }
}
