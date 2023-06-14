package org.learning.java.exercises.event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventProgram {

  private String title;
  private List<Event> program;

  public EventProgram(String title) {
    this.title = title;
    program = new ArrayList<>();
  }

  // un metodo che svuota la lista di eventi
  public void clearProgram() {
    program.clear();
  }

  //  un metodo che aggiunge alla lista un Evento, passato come parametro
  public void addEvent(Event event) {
    program.add(event);
  }

  //un metodo che restituisce una lista con tutti gli eventi presenti in una certa data
  public List<Event> getEventsByDate(LocalDate date) {
    List<Event> eventList = new ArrayList<>();
    for (Event e : program) {
      // verifico se l'evento corrente è nella data richiesta
      if (e.getDate().isEqual(date)) {
        // aggiungo l'evento alla lista
        eventList.add(e);
      }
    }
    return eventList;
  }

  // un metodo che restituisce quanti eventi sono presenti nel programma
  public int getNumberOfEvents() {
    return program.size();
  }

  // un metodo che rimuove un evento passato come parametro dalla lista
  public boolean removeEvent(Event e) {
    return program.remove(e);
  }

  /* OVERRIDE */

  @Override
  public String toString() {
    String result = this.title + "\n";
    for (Event e : program) {
      result += "-" + e.toString() + "\n";
    }
    return result;
  }
}
