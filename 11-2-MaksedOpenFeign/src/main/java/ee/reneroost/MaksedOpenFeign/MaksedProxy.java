package ee.reneroost.MaksedOpenFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "maksed",
url = "${name.service.url}")
public interface MaksedProxy {

    @PostMapping("/makse")
    Makse looMakse(
            @RequestHeader String requestId,
            @RequestBody Makse makse);
}
