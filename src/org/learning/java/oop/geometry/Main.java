package org.learning.java.oop.geometry;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Rectangle example = new Rectangle(10, 20);

    Scanner scan = new Scanner(System.in);
    // Chiedo i dati all'utente
    System.out.print("Base: ");
    int base = scan.nextInt();
    System.out.print("Height: ");
    int height = scan.nextInt();
    // posso validare i dati

    // con quei dati costruisco il rettangolo
    Rectangle rectangle = new Rectangle(base, height);

    System.out.println("You have a rectangle with base " + rectangle.getBase());
    /*rectangle.height = -10;*/
    System.out.print("Change base: ");
    int newBase = scan.nextInt();
    rectangle.setBase(newBase);

    // stampo perimetro e area
    System.out.println("Perimeter: " + rectangle.getPerimeter());
    System.out.println("Area: " + rectangle.getArea());

    scan.close();
  }
}
