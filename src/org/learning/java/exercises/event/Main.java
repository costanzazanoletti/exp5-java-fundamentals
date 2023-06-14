package org.learning.java.exercises.event;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome! Please insert event");
    System.out.print("title: ");
    String title = scan.nextLine();
    LocalDate date = null;
    do {
      System.out.print("date (yyyy-MM-dd): ");
      String dateString = scan.nextLine();
      try {
        date = LocalDate.parse(dateString);
      } catch (DateTimeException e) {
        System.out.println("Invalid date format");
      }
    } while (date == null);
    System.out.print("number of seats: ");
    int seats = Integer.parseInt(scan.nextLine());

    Event event = null;
    try {
      event = new Event(title, date, seats);
      System.out.println("You created the event " + event.toString());
    } catch (IllegalArgumentException e) {
      System.out.println("Unable to create the event");
      System.out.println(e.getMessage());
    }

    scan.close();
  }
}
