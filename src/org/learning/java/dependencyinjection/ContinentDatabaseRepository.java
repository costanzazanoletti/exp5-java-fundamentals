package org.learning.java.dependencyinjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContinentDatabaseRepository implements ContinentRepositoryInterface {

  private final static String URL = "jdbc:mysql://localhost:3306/db_countries";
  private final static String USER = "root";
  private final static String PASSWORD = "rootpassword";

  @Override
  public List<String> getContinents() {
    List<String> continents = new ArrayList<>();
    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
      try (PreparedStatement ps = conn.prepareStatement("SELECT name FROM continents;")) {
        try (ResultSet rs = ps.executeQuery()) {
          while (rs.next()) {
            continents.add(rs.getString("name"));
          }
        }
      }
    } catch (SQLException e) {
      System.out.println("unable to connect");
    }
    return continents;
  }
}
