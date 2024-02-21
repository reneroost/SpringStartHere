package ee.reneroost.HttpVastus;

public class Riik {

    private String nimi;
    private int rahvaarvMln;

    public static Riik riikTehas(
            String nimi,
            int rahvaarvMln) {
        Riik riik = new Riik();
        riik.setNimi(nimi);
        riik.setRahvaarvMln(rahvaarvMln);
        return riik;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getRahvaarvMln() {
        return rahvaarvMln;
    }

    public void setRahvaarvMln(int rahvaarvMln) {
        this.rahvaarvMln = rahvaarvMln;
    }
}
