package org.learning.java.oop.geometry;

public class CalcoliHelper {

  private CalcoliHelper() {
    // costruttore privato per non istanziare oggetti di tipo CalcoliHelper
  }

  public static double sum(double n1, double n2) {
    return n1 + n2;
  }

  public static double subtract(double n1, double n2) {
    return n1 - n2;
  }

  public static double multiply(double n1, double n2) {
    return n1 * n2;
  }

  public static double divide(double n1, double n2) {
    return n1 / n2;
  }

}
