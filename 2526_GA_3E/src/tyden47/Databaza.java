package tyden47;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Databaza {
    public static void main(String[] args) {
        List<Clovek> ppl = new ArrayList<Clovek>();
        ppl.add(new Clovek("Jan", "Lana", 3));
        ppl.add(new Clovek("Maria", "Lanova", 4));
        ppl.add(new Clovek("Pepa", "Zdepa", 1));
        ppl.add(new Clovek("Henry", "Weiss", 2));

        System.out.println(ppl);

        try(Connection con = DriverManager.getConnection("jdbc: .....", null, null)) {
            try(Statement st = con.createStatement()) {
                String sqlCommand = "INSERT INTO clovek(name, surname, year) VALUES ("
                        + "'" + ppl.get(0).name + "',"
                        + "'" + ppl.get(0).surname + "',"
                        + ppl.get(0).year + ")";

                System.out.println(sqlCommand);
                st.executeUpdate(sqlCommand);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
