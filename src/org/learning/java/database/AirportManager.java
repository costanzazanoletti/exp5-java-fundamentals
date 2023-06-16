package org.learning.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportManager {

  public static void main(String[] args) {
    // Parametri di connessione
    String url = "jdbc:mysql://localhost:3306/db_aeroporto";
    String user = "root";
    String password = "rootpassword";

    Scanner scan = new Scanner(System.in);

    // Lista degli aeroporti
    List<Airport> airports = new ArrayList<>();

    // provo ad aprire una connessione al database
    try (Connection connection = DriverManager.getConnection(url, user, password)) {

      // chiedo all'utente di dirmi la città
      System.out.print("Which city?: ");
      String parameter = scan.nextLine();
      // preparo lo statement SQL da eseguire
      String sql = "SELECT * FROM airports WHERE city like ?;";

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
            int id = rs.getInt("id");
            Timestamp createdAt = rs.getTimestamp("created_at");
            Timestamp updatedAt = rs.getTimestamp("updated_at");
            // prendo i dati dal database e ci costruisco un oggetto di tipo Airport
            Airport airport = new Airport(id, code, name, city, createdAt.toLocalDateTime(),
                updatedAt.toLocalDateTime());
            // aggiungo l'oggetto alla lista di Airport
            airports.add(airport);
          }
        }
      }


    } catch (SQLException e) {
      System.out.println("Unable to connect to database");
      e.printStackTrace();
    }

    System.out.println("Airports");
    System.out.println(airports);
  }
}
