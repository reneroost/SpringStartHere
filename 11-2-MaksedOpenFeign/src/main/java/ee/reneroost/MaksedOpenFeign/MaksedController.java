package ee.reneroost.MaksedOpenFeign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MaksedController {

    private final MaksedProxy maksedProxy;

    public MaksedController(MaksedProxy maksedProxy) {
        this.maksedProxy = maksedProxy;
    }

    @PostMapping("/makse")
    public Makse looMakse(
            @RequestBody Makse makse
    ){
        String requestId = UUID.randomUUID().toString();
        return maksedProxy.looMakse(requestId, makse);
    }
}
