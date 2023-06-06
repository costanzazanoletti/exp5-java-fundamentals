package org.learning.java.composition;

public class Main {

  public static void main(String[] args) {
    Address address1 = new Address("main", "Springfield", "12234");
    Person john = new Person("John", address1);
    System.out.println(john);

    address1.setStreet("22th");
    Person jane = new Person("Jane", address1);
    System.out.println(jane);
    System.out.println(john);

    Address johnAddress = john.getAddress();
    johnAddress.setCity("NY City");
  }
}
