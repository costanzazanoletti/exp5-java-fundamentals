package org.learning.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainArrayList {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Person> people = new ArrayList<>();

    boolean flag = false;

    do {
      System.out.println("Insert new person?(Y/N)");
      String choice = scan.nextLine();

      switch (choice) {
        case "Y": // insert new person
          try {
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scan.nextLine());
            people.add(new Person(name, age));
          } catch (NumberFormatException e) {
            System.out.println("Invalid number");
          } catch (InvalidPersonException e) {
            System.out.println("Invalid person data");
          }
          break;
        case "N":
          flag = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (!flag);

    System.out.println("People: " + people);

    // try-with-resources alla fine del blocco try-catch chiude automaticamente la risorsa
    // che è stata creata nelle parentesi (FileWriter)
    try (FileWriter writer = new FileWriter("./resources/people.txt", true)) {
      for (Person p : people) {
        writer.write(p.toString() + "\n");
      }
    } catch (IOException e) {
      System.out.println("Unable to write to file");
    }

    try (Scanner reader = new Scanner(new File("./resources/people.txt"))) {
      int count = 0;
      while (reader.hasNextLine()) {
        System.out.println(++count + ") " + reader.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("Unable to read file");
    }

  }

}
