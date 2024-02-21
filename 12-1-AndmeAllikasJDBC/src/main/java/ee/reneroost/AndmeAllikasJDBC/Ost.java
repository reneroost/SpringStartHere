package ee.reneroost.AndmeAllikasJDBC;

import java.math.BigDecimal;

public class Ost {

    private int id;
    private String toode;
    private BigDecimal hind;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToode() {
        return toode;
    }

    public void setToode(String toode) {
        this.toode = toode;
    }

    public BigDecimal getHind() {
        return hind;
    }

    public void setHind(BigDecimal hind) {
        this.hind = hind;
    }
}
