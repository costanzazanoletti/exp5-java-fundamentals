package org.learning.java.inheritance;

public class Contenuto {

  private String titolo;

  public Contenuto(String titolo) {
    this.titolo = titolo;
  }

  public String getTitolo() {
    return titolo;
  }

  public void riproduci() {
    System.out.println("Sto riproducendo " + titolo);
  }

  @Override
  public String toString() {
    return "Contenuto " + titolo;
  }
}
