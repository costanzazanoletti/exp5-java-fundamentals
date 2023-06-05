package org.learning.java.oop.geometry;

import java.util.Random;
import java.util.Scanner;

public class TestCalcoliHelper {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("First number: ");
    double n1 = scan.nextDouble();

 /*   System.out.println("Second number: ");
    double n2 = scan.nextDouble();*/

    double n2 = randomNumber();

    System.out.println("Sum: " + CalcoliHelper.sum(n1, n2));
    System.out.println("Subtract: " + CalcoliHelper.subtract(n1, n2));
    System.out.println("Multiply: " + CalcoliHelper.multiply(n1, n2));
    System.out.println("Divide: " + CalcoliHelper.divide(n1, n2));

    /* CalcoliHelper ch = new CalcoliHelper();*/

    scan.close();
  }


  private static int randomNumber() {
    Random r = new Random();
    return r.nextInt();
  }
}
