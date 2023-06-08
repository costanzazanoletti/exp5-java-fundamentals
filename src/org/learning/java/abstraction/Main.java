package org.learning.java.abstraction;

public class Main {

  public static void main(String[] args) {
    /*Animal animal = new Animal();
    animal.sleep();
    animal.makeNoise();*/

    Cow cow = new Cow("Gina");
    cow.makeNoise();
    cow.sleep();

    Animal[] farm = new Animal[3];
    farm[0] = new Cow("Gina");
    farm[1] = new Cat("Tom");
    farm[2] = new Fish("Lady");

    for (Animal a : farm) {
      a.makeNoise();
      
    }

    CanSwim[] acquario = new CanSwim[3];
    for (CanSwim cs : acquario) {
      cs.swim(3);

    }
  }

}
