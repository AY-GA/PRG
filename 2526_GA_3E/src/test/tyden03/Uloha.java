package test.tyden03;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Uloha {
    public static void main(String[] args) throws SQLException {
        while (true) {
            try (Connection conn = DriverManager.getConnection("jdbc:postgresql:db3963")) {
                Scanner sc = new Scanner(System.in);
                String line = sc.nextLine();

                String[] parts = line.split(" ", 2);
                String prijmeni = parts[0];
                String jmenoKnihy = parts.length > 1 ? parts[1] : "";

                int idKnihy = findKniha(conn, jmenoKnihy);
                if (idKnihy == 0) continue;
                int idUzivatele = findUser(conn, prijmeni);
                if (idUzivatele == 0) continue;

                try {
                    borrowBook(conn, idUzivatele, idKnihy);
                } catch (SQLException e) {
                    System.out.println("chyba");
//                throw new RuntimeException(e);
                }
            }
        }
    }

    public static int findUser(Connection conn, String userName) throws SQLException {
        String sql = "SELECT id FROM uzivatel WHERE prijmeni = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, userName);

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("neznamy uzivatel");
                return 0;
            }
            return rs.getInt("id");
        }
    }

    public static int findKniha(Connection conn, String bookName) throws SQLException {
        String sql = "SELECT id FROM kniha WHERE jmeno = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, bookName);

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("neznama kniha");
                return 0;
            }
            return rs.getInt("id");
        }
    }

    public static void borrowBook(Connection conn, int userId, int bookId) throws SQLException {
        assert userId > 0;
        assert bookId > 0;
        String sql = "INSERT INTO vypujcka (id_u, id_k, vypujceno) VALUES (?, ?, ?)";

        if (isBorrowed(conn, userId, bookId)) returnBook(conn, userId, bookId);
        else
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, userId);
                ps.setInt(2, bookId);
                ps.setDate(3, Date.valueOf(LocalDate.now()));
                ps.executeUpdate();
            }
    }

    public static void returnBook(Connection conn, int userId, int bookId) throws SQLException {
        assert userId > 0;
        assert bookId > 0;
        String sql = "UPDATE vypujcka SET vraceno = ? WHERE id_u = ? AND id_k = ? AND vraceno IS NULL";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, userId);
            ps.setInt(2, bookId);
            ps.setDate(3, Date.valueOf(LocalDate.now()));
            ps.executeUpdate();
        }
    }

    public static boolean isBorrowed(Connection conn, int userId, int bookId) throws SQLException {
        String sql = "SELECT * FROM vypujcka WHERE id_u = ? AND id_k = ? AND vraceno IS NULL";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ps.setInt(2, bookId);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        }
    }
}
