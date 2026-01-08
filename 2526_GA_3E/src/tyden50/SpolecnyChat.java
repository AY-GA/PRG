package tyden50;

import tyden02.SpolecnyChatReader;

import java.sql.*;

public class SpolecnyChat {
    static void main() {
        SpolecnyChatReader reader = new SpolecnyChatReader();
        reader.run();

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql:db3963", "db3963", "programovani")) {
            System.out.println("ceka na vstup z klavesnice..");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
