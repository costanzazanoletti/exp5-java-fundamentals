package org.learning.java.exercises;

import java.util.Scanner;

public class FizzBuzz {

  public static void main(String[] args) {
    int n = 100;

    Scanner scan = new Scanner(System.in);

    boolean validInput = false;
    while (!validInput) {
      System.out.print("Number > 0 and < 1000: ");
      n = Integer.parseInt(scan.nextLine());
      if (n > 0 && n < 1000) { // n valid
        validInput = true;
      }
    }
    // FizzBuzz
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }

    }

    scan.close();
  }
}
