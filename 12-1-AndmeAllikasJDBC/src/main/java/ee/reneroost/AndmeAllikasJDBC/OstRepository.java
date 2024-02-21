package ee.reneroost.AndmeAllikasJDBC;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OstRepository {

    private final JdbcTemplate jdbc;

    public OstRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void hoiustaOst(Ost ost) {
        String sql = "INSERT INTO ost VALUES (DEFAULT, ?, ?)";

        jdbc.update(sql, ost.getToode(), ost.getHind());
    }

    public List<Ost> leiaKoikOstud() {
        String sql = "SELECT * FROM ost";

        RowMapper<Ost> ostRowMapper = (r, i) -> {
            Ost rowObject = new Ost();
            rowObject.setId(r.getInt("id"));
            rowObject.setToode(r.getString("toode"));
            rowObject.setHind(r.getBigDecimal("hind"));
            return rowObject;
        };

        return jdbc.query(sql, ostRowMapper);
    }

}
