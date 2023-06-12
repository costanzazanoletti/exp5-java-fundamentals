package org.learning.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.learning.java.files.Person;

public class ContainsExamples {

  public static void main(String[] args) {
    // contains su lista di Integer
    List<Integer> numbers = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6}));
    int n = 50;
    System.out.println("List contains " + n);
    System.out.println(numbers.contains(n));

    // Contains su lista di oggetti custom
    List<Person> people = new ArrayList<>();
    Person will = new Person("Will", 11);
    people.add(will);
    people.add(new Person("Max", 12));
    people.add(new Person("Dustin", 13));
    System.out.println("List contains person");
    System.out.println(people.contains(new Person("Will", 11)));

  }
}
