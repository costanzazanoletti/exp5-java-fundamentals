package org.learning.java.exercises.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Creo una istanza di Product col costruttore vuoto
    Product p = new Product();

    // raccolgo input utente
    System.out.print("Name: ");
    String nameInput = scan.nextLine();
    System.out.print("Description: ");
    String descriptionInput = scan.nextLine();
    System.out.print("Price: ");
    String priceString = scan.nextLine();
    BigDecimal priceInput = new BigDecimal(priceString);
    System.out.print("Vat: ");
    String vatString = scan.nextLine();
    BigDecimal vatInput = new BigDecimal(vatString);

    // assegno input al product
    p.setName(
        nameInput); // assegno al campo name di Product p il valore nameInput preso dallo scanner
    p.setDescription(descriptionInput);
    p.setPrice(priceInput);
    p.setVat(vatInput);

    System.out.println("Product " + p.getFullName());
    System.out.println("Full price: " + p.getFullPrice());

    scan.close();
  }
}
