package org.learning.java.abstraction;

public class Fish extends Animal implements CanSwim {

  public Fish(String name) {
    super(name);
  }

  @Override
  public void makeNoise() {
    System.out.println("blub");
  }

  @Override
  public void swim(int time) {
    for (int i = 0; i < time; i++) {
      System.out.println("I swim");
    }
  }
}
