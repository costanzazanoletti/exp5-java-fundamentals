package org.learning.java.exceptions;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
/*    String s = null;
    System.out.println(s.length());*/

    Scanner scan = new Scanner(System.in);

    int n = 0;
    do {
      System.out.print("Insert a number (not 0)");
      try {
        n = Integer.parseInt(scan.nextLine());
      } catch (Exception e) {
        System.out.println("Invalid input");

      }
    } while (n == 0);
    System.out.println(n);
  }
}
