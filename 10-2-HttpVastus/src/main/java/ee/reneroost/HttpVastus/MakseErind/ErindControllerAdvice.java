package ee.reneroost.HttpVastus.MakseErind;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErindControllerAdvice {

    @ExceptionHandler(PolePiisavaltRahaErind.class)
    public ResponseEntity<VeaDetailid> erindPolePiisavaltRahaHandler() {
        VeaDetailid veaDetailid = new VeaDetailid();
        veaDetailid.setSonum("Makse sooritamiseks pole piisavalt raha.");
        return ResponseEntity
                .badRequest()
                .body(veaDetailid);
    }
}
