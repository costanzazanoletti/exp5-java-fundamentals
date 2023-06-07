package org.learning.java.files;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  /*Creare un programma che prenda in input il numero di persone che si vuole inserire all'interno di un array.
  Fare poi un ciclo while che inserisca le persone (rappresentate da una classe Persona) all'interno della lista.
  Lanciare un'eccezione se i dati delle persone non sono corretti (nome vuoto, eta <= 0), in quel caso la persona non viene inserita nella lista
  Stampare alla fine l'elenco delle persone inserite.*/
  public static void main(String[] args) {
  /*  File file = new File(".");
    System.out.println(file.exists());
    System.out.println(file.isDirectory());
    if (file.isDirectory()) {
      System.out.println(Arrays.toString(file.list()));
    }*/

    Scanner scan = new Scanner(System.in);
    System.out.print("How many people? ");
    int nPeople = Integer.parseInt(scan.nextLine());

    Person[] people = new Person[nPeople];
    // aggiungo le persone all'array
    for (int i = 0; i < nPeople; i++) {
      // chiedo il nome
      Person p = null;
      boolean validPerson = false;
      do {
        try {
          System.out.print("Name: ");
          String name = scan.nextLine();
          // chiedo l'età
          System.out.print("Age: ");
          int age = Integer.parseInt(scan.nextLine());
          // provo a costruire la Person

          p = new Person(name, age);
          validPerson = true;
        } catch (InvalidPersonException e) {
          System.out.println("Person name must not be null and age >=0");
        } catch (NumberFormatException ne) {
          System.out.println("Invalid number");
        }
      } while (!validPerson);
      // aggiungo la persona all'array
      people[i] = p;
    }
    // stampo l'array
    System.out.println(Arrays.toString(people));
    scan.close();

  }
}
