package org.learning.java.exercises.event;

import java.time.LocalDate;

public class MainEventProgram {

  public static void main(String[] args) {
    EventProgram events = new EventProgram("Eventi Java");
    events.addEvent(new Event("Java conference", LocalDate.parse("2023-08-01"), 100));
    events.addEvent(new Event("Hackathlon", LocalDate.parse("2023-10-10"), 500));
    events.addEvent(new Event("Spring meetup", LocalDate.parse("2023-10-10"), 20));

    System.out.println(events);
    events.removeEvent(new Event("Spring meetup", LocalDate.parse("2023-10-10"), 20));
    System.out.println(events);

  }
}
