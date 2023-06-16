package org.learning.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Parametri di connessione
    String url = "jdbc:mysql://localhost:3306/db_aeroporto";
    String user = "root";
    String password = "rootpassword";

    Scanner scan = new Scanner(System.in);

    // provo ad aprire una connessione al database
    try (Connection connection = DriverManager.getConnection(url, user, password)) {
      // stampo il catalogo dei database
      System.out.println(connection.getCatalog());

      // chiedo all'utente di dirmi la città
      System.out.print("Which city?: ");
      String parameter = scan.nextLine();
      // preparo lo statement SQL da eseguire
      String sql = "SELECT * FROM airports WHERE city like ?;";
      System.out.println("Query: " + sql);
      // chiedo alla Connection di preparare lo statement
      try (PreparedStatement ps = connection.prepareStatement(sql)) {
        // settiamo il parametro della query
        ps.setString(1, "%" + parameter + "%");
        // eseguo lo statement che restituisce un ResultSet
        try (ResultSet rs = ps.executeQuery()) {
          // itero sulle righe del ResultSet
          while (rs.next()) {
            // per ogni riga prendo i valori dalle singole colonne
            String code = rs.getString("code");
            String name = rs.getString("name");
            String city = rs.getString("city");
            // stampo i valori
            System.out.println(code + " - " + name + " - " + city);
          }
        }
      }
      // Preparo lo statement di insert
      String insertStmt = """
          INSERT INTO airports (code, name, city, created_at, updated_at)
          VALUES(?, ?, ?, ?, ?);
          """;
      System.out.println("Insert new airport");
      System.out.print("Code: ");
      String code = scan.nextLine();
      System.out.print("Name: ");
      String name = scan.nextLine();
      System.out.print("City: ");
      String city = scan.nextLine();
      Timestamp now = Timestamp.valueOf(LocalDateTime.now());

      try (PreparedStatement ps = connection.prepareStatement(insertStmt)) {
        // setto i parametri della insert
        ps.setString(1, code);
        ps.setString(2, name);
        ps.setString(3, city);
        ps.setTimestamp(4, now);
        ps.setTimestamp(5, now);

        // eseguo la insert
        int affectedRows = ps.executeUpdate();
        if (affectedRows == 1) {
          System.out.println("Inserted successfully");
        }
      }

    } catch (SQLException e) {
      System.out.println("Unable to connect to database");
      e.printStackTrace();
    }
  }
}
