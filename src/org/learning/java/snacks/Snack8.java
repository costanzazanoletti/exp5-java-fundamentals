package org.learning.java.snacks;

import java.util.Scanner;

public class Snack8 {

  /*
    - Chiedi un numero di 4 cifre all’utente
    - calcola la somma di tutte le cifre che compongono il numero
    6753 -> 6 + 7 + 5 + 3 = 21
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean validNumber = false;
    int number;
    do {
      System.out.print("Insert a 4 digit number: ");
      number = scan.nextInt();
      if (number > 999 && number < 10000) {
        // valid number
        validNumber = true;
      }
    } while (!validNumber);

    System.out.println("You number: " + number);
    scan.close();
  }
}
