package org.learning.java.dependencyinjection;

public class ContinentRepositoryFactory {

  private static String type = "database"; // possible values: memory|database

  public static ContinentRepositoryInterface getContinentRepository() {
    if (type.equals("memory")) {
      return new ContinentMemoryRepository();
    } else if (type.equals("database")) {
      return new ContinentDatabaseRepository();
    } else {
      return null;
    }
  }
}
