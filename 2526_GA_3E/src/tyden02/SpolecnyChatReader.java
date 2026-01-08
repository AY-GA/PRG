package tyden02;

import java.sql.*;
import java.util.Collection;

public class SpolecnyChatReader extends Thread {
    @Override
    public void run() {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql:db3963", "db3963", "programovani")) {
            sledujChat(conn);

        } catch (SQLException | InterruptedException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    private static void sledujChat(Connection conn) throws SQLException, InterruptedException {
        int posledniId = 0;
        while (true) {
            try (Statement stmt = conn.createStatement()) {
                String sql = "SELECT * FROM zprava WHERE id >= " + posledniId;
                System.out.println(sql);

                try (ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        String autor = rs.getString("autor");
                        String zprava = rs.getString("msg");
                        posledniId = rs.getInt(1);

                        System.out.println(autor + ": " + zprava);
                    }
                }
            }
            Thread.sleep(2000);
        }
    }
}
