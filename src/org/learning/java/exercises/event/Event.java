package org.learning.java.exercises.event;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {

  /* ATTRIBUTI*/
  private String title;
  private LocalDate date;

  private int seats;

  private int bookedSeats;

  /* COSTRUTTORI */
  public Event(String title, LocalDate date, int seats) throws IllegalArgumentException {
    // se il titolo è nullo o stringa vuota solleva un'eccezione
    validateStringNotBlank(title);
    // se la data è nel passato solleva un'eccezione
    validateDateNotInThePast(date);
    // se il numero dei posti non è positivo
    if (seats <= 0) {
      // non posso proseguire col costruttore e sollevo un'eccezione
      throw new IllegalArgumentException("Seats must be a positive number");
    }
    this.title = title;
    this.date = date;
    this.seats = seats;
    this.bookedSeats = 0;
  }

  /* GETTERS e SETTERS*/


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) throws IllegalArgumentException {
    validateStringNotBlank(title);
    this.title = title;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public int getSeats() {
    return seats;
  }

  public int getBookedSeats() {
    return bookedSeats;
  }

  public int getAvailableSeats() {
    return seats - bookedSeats;
  }

  public String getFormattedDate() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return this.date.format(formatter);
  }

  /* METODI */
  public void book() throws RuntimeException {
    if (this.date.isBefore(LocalDate.now())) {
      throw new RuntimeException("You cannot book an event in the past");
    }
    if (getAvailableSeats() == 0) {
      throw new RuntimeException("There are no available seats");
    }
    bookedSeats++;
  }

  public void cancel() throws RuntimeException {
    if (this.date.isBefore(LocalDate.now())) {
      throw new RuntimeException("You cannot cancel an event in the past");
    }
    if (bookedSeats == 0) {
      throw new RuntimeException("There are no bookings to cancel");
    }
    bookedSeats--;
  }

  private void validateStringNotBlank(String s) throws IllegalArgumentException {
    if (s == null || s.isEmpty()) {
      // non posso proseguire col costruttore
      throw new IllegalArgumentException("title must not be blank");
    }
  }

  private void validateDateNotInThePast(LocalDate d) {
    if (d == null || d.isBefore(LocalDate.now())) {
      throw new IllegalArgumentException("date must not be null or in the past");
    }
  }


  /* OVERRIDE */
  @Override
  public String toString() {
    return getFormattedDate() + "-" + getTitle();
  }
}
