package org.learning.java.composition;

public class Address {

  String street;
  String city;
  String zip;

  public Address(String street, String city, String zip) {
    this.street = street;
    this.city = city;
    this.zip = zip;
  }

  // costruttore per copia
  public Address(Address addressToClone) {
    this.street = addressToClone.street;
    this.city = addressToClone.city;
    this.zip = addressToClone.zip;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "Address{" +
        "street='" + street + '\'' +
        ", city='" + city + '\'' +
        ", zip='" + zip + '\'' +
        '}';
  }
}
