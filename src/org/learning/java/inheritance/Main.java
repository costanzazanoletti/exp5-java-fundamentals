package org.learning.java.inheritance;

public class Main {

  public static void main(String[] args) {
    Contenuto contenuto = new Contenuto("Generico contenuto");
    contenuto.riproduci();

    Serie serie = new Serie("Ted Lasso", 12);
    serie.riproduci();

    System.out.println(serie.toString());
    System.out.println(contenuto.toString());

    Object squidGame = new Serie("Squid Game", 20);
    System.out.println(squidGame.toString());

  }
}
