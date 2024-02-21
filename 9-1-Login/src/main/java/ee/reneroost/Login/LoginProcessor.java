package ee.reneroost.Login;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private String kasutajanimi;
    private String parool;

    public boolean login() {
        String kasutajanimi = this.getKasutajanimi();
        String parool = this.getParool();

        if ("natalie".equals(kasutajanimi) && "parool".equals(parool)) {
            return true;
        } else {
            return false;
        }

    }

    public String getKasutajanimi() {
        return kasutajanimi;
    }

    public void setKasutajanimi(String kasutajanimi) {
        this.kasutajanimi = kasutajanimi;
    }

    public String getParool() {
        return parool;
    }

    public void setParool(String parool) {
        this.parool = parool;
    }
}
