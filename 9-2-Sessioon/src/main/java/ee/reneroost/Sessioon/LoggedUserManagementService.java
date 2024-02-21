package ee.reneroost.Sessioon;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoggedUserManagementService {

    private String kasutajanimi;

    public String getKasutajanimi() {
        return kasutajanimi;
    }

    public void setKasutajanimi(String kasutajanimi) {
        this.kasutajanimi = kasutajanimi;
    }
}
