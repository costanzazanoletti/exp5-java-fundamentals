package org.learning.java.oop.geometry;

public class Rectangle {

  // CONSTANTS
  public static final int NUMBER_OF_DIMENSIONS = 4;
  private static int counter = 0;

  // FIELDS (private)
/*  private int base;
  private int height;*/
  private int[] dimensions;

  // CONSTRUCTORS (public)
  public Rectangle(int base, int height) {
    // increment counter
    counter++;
    System.out.println("we have " + counter + " rectangles");
    dimensions = new int[2];
    dimensions[0] = base;
    dimensions[1] = height;
 /*   this.base = base;
    this.height = height;*/
  }

  // GETTERS SETTERS
  public int getBase() {
    //return this.base;
    return dimensions[0];
  }

  public void setBase(int base) {
    if (base > 0) {
      //this.base = base;
      this.dimensions[0] = base;
    } else {
      System.out.println("Base must be a positive integer");
    }
  }

  // METHODS
  // method to compute perimeter
  public int getPerimeter() {
    //return this.base * 2 + this.height * 2;
    return (dimensions[0] + dimensions[1]) * 2;
  }

  // method to compute area
  public int getArea() {
    //return base * height;
    return dimensions[0] * dimensions[1];
  }

  // method to increment/decrement base of an amount
  public void incrementBase(int amount) {
    //this.base += amount;
    dimensions[0] += amount;
  }
}
