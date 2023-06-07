package org.learning.java.files;

public class Person {

  private String name;
  private int age;

  public Person(String name, int age) throws InvalidPersonException {
    // procedo solo se name != null e age >=0
    if (name != null && age >= 0) {
      this.name = name;
      this.age = age;
    } else {
      // se i campi non sono validi
      throw new InvalidPersonException();
    }

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException();
    }
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
