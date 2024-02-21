package ee.reneroost.Maksed;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class MaksedController {

    private static Logger logger = Logger.getLogger(MaksedController.class.getName());

    @PostMapping("/makse")
    public ResponseEntity<Makse> looMakse(
            @RequestHeader String requestId,
            @RequestBody Makse makse
    ) {
        logger.info("Sain requesti ID-ga " + requestId + "; Makse summa: " + makse.getSumma());

        makse.setId(UUID.randomUUID().toString());

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(makse);
    }
}
