package org.learning.java.exercises.event;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concert extends Event {

  /* ATTRIBUTI */
  private LocalTime time;
  private BigDecimal price;

  /* COSTRUTTORI*/
  public Concert(String title, LocalDate date, int seats, LocalTime time, BigDecimal price)
      throws IllegalArgumentException {
    super(title, date, seats);
    // faccio un controllo sul prezzo
    validatePriceNotNegative(price);
    this.price = price;
    this.time = time;
  }

  /* GETTERS E SETTERS */

  public LocalTime getTime() {
    return time;
  }

  public void setTime(LocalTime time) {
    this.time = time;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) throws IllegalArgumentException {
    validatePriceNotNegative(price);
    this.price = price;
  }

  /* METODI */

  public String getFormattedDateAndTime() {
    String dateFormatted = this.getFormattedDate();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM");
    String timeFormatted = time.format(formatter);
    return dateFormatted + " " + timeFormatted;
  }

  public String getFormattedPrice() {
    DecimalFormat df = new DecimalFormat("##.##€");
    return df.format(this.price);
  }

  private void validatePriceNotNegative(BigDecimal p) {
    if (p.compareTo(new BigDecimal(0)) < 0) {
      throw new IllegalArgumentException("Price must not be negative");
    }
  }

  /* OVERRIDE */

  @Override
  public String toString() {
    return getFormattedDateAndTime() + "-" + getTitle() + "-" + getFormattedPrice();
  }
}
