package org.learning.java.oop.auto;

public class Auto {

  // CAMPI o ATTRIBUTI
  String colore;
  String marca;
  int annoImmatricolazione;
  boolean ibrida;


  // COSTRUTTORI
  Auto() {
    colore = "marrone";
    annoImmatricolazione = 2023;
  }

  Auto(String colore, String marca, int annoImmatricolazione, boolean ibrida) {
    this.colore = colore;
    this.marca = marca;
    this.annoImmatricolazione = annoImmatricolazione;
    this.ibrida = ibrida;
  }

  // METODI
  String getDati() {
    String dati = "colore: " + colore + "\n" + "marca: " + marca + "\n" + "anno immatricolazione: "
        + annoImmatricolazione + "\n" + "ibrida: " + ibrida;
    return dati;
  }
}
