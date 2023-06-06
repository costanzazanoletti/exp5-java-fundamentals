package org.learning.java.exercises.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {

  // FIELDS
  private int code;
  private String name;
  private String description;
  private BigDecimal price;
  private BigDecimal vat;

  // CONSTRUCTORS
  public Product() {
    code = generateCode();
  }

  public Product(String name, String description, BigDecimal price, BigDecimal vat) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.vat = vat;
    code = generateCode();
  }

  // GETTERS & SETTERS


  public String getFullName() {
    return code + "-" + name;
  }

  public int getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getVat() {
    return vat;
  }

  // METHODS

  public void setVat(BigDecimal vat) {
    this.vat = vat;
  }

  public BigDecimal getFullPrice() {
    // price += price*vat
    BigDecimal vatOnPrice = price.multiply(vat);
    return price.add(vatOnPrice);
  }

  private int generateCode() {
    Random rand = new Random();
    return rand.nextInt(1000);
  }
}
