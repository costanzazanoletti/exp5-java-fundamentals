package org.learning.java.inheritance;

public class Serie extends Contenuto {

  private int numeroEpisodi;

  public Serie(String titolo, int numeroEpisodi) {
    super(titolo);
    this.numeroEpisodi = numeroEpisodi;
  }

  @Override
  public void riproduci() {
    super.riproduci();
    System.out.println("In " + numeroEpisodi + " episodi");
  }

  @Override
  public String toString() {
    return "Serie " + getTitolo();
  }
}
