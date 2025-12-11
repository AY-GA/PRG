package tyden50;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SpolecnyChat {
    static void main() {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql:db3963", "db3963", "programovani")) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
