package org.learning.java.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatesExamples {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println("Today is " + today);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formattedToday = today.format(formatter);
    System.out.println(formattedToday);

    LocalDate endOfCourse = LocalDate.of(2023, 7, 10);
    endOfCourse = LocalDate.parse("10/07/2023", formatter);

    boolean courseIsOver = endOfCourse.isBefore(today);

    
  }
}
