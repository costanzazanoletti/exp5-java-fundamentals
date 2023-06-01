package org.learning.java.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {

  public static void main(String[] args) {
    // COSTANTI
    final double PRICE_PER_KM = 0.21;
    final double DISCOUNT_UNDER_AGE = 0.2;
    final double DISCOUNT_OVER_65 = 0.4;

    // INPUT
    Scanner scan = new Scanner(System.in);
    System.out.println("WELCOME!");
    System.out.print("Number of km: ");
    int km = Integer.parseInt(scan.nextLine());
    System.out.print("Passenger age: ");
    int age = Integer.parseInt(scan.nextLine());

    // OUTPUT: PREZZO FINALE
    // calcolo il prezzo base
    double price = PRICE_PER_KM * km;
    // applico lo sconto se applicabile
    if (age < 18) {
      price -= price * DISCOUNT_UNDER_AGE;
    } else if (age >= 65) {
      price -= price * DISCOUNT_OVER_65;
    }
    DecimalFormat df = new DecimalFormat("0.00€");
    System.out.println("The final price is " + df.format(price));
    // close the scanner
    scan.close();
  }
}
