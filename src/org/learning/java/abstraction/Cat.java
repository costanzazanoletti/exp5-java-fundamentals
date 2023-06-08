package org.learning.java.abstraction;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("Meow");
  }
}
