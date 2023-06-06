package org.learning.java.composition;

public class Person {

  String name;
  Address address;

  public Person(String name, Address address) {
    this.name = name;
    this.address = new Address(address.street, address.city, address.zip);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    //this.address = new Address(address.street, address.city, address.zip);
    this.address = new Address(address);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", address=" + address +
        '}';
  }
}
