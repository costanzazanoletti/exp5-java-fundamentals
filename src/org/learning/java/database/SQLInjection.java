package org.learning.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SQLInjection {

  public static void main(String[] args) {
    // Parametri di connessione
    String url = "jdbc:mysql://localhost:3306/db_aeroporto";
    String user = "root";
    String password = "rootpassword";

    Scanner scan = new Scanner(System.in);

    System.out.println("Please log in ");
    System.out.println("Id: ");
    String id = scan.nextLine();
    System.out.println("Tax code: ");
    String taxCode = scan.nextLine();

    String loginQuery =
        "SELECT * FROM passengers WHERE id = " + id + " AND tax_code = '" + taxCode + "';";

    String safeQuery = "SELECT * FROM passengers WHERE id = ? AND tax_code = ?;";
    //System.out.println("Query: " + loginQuery);
    System.out.println("Query: " + safeQuery);

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
      try (PreparedStatement ps = conn.prepareStatement(safeQuery)) {
        // settiamo i parametri della query
        ps.setInt(1, Integer.parseInt(id));
        ps.setString(2, taxCode);

        try (ResultSet rs = ps.executeQuery()) {
          if (rs.next()) {
            System.out.println("You logged in");
          } else {
            System.out.println("Unknown user");
          }
        }
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  ;
}
