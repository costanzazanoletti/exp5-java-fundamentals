package org.learning.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * Chiedere all'utente di dirmi dei numeri interi, di scegliere quando fermarsi,
 * aggiungo questi numeri ad una lista e ne calcolo la somma
 * Genero una nuova lista che contiene solo i numeri pari della lista di partenza
 * */
public class DynamicSum {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // lista dove aggiungerò i numeri
    List<Integer> numbers = new LinkedList<>();//new ArrayList<>();
    System.out.println("La lista è vuota? " + numbers.isEmpty());

    // menu testuale
    boolean stop = false;
    do {
      System.out.println("Insert a number (stop to quit)");
      String choice = scan.nextLine();
      switch (choice) {
        case "stop":
          stop = true;
          break;
        default:

          try {
            int num = Integer.parseInt(choice);
            numbers.add(num);
          } catch (NumberFormatException e) {
            System.out.println("Invalid number");
          }

          break;
      }
    } while (!stop);
    System.out.println("The list is: " + numbers);
    // se la lista è vuota stampo solo un messaggio
    if (numbers.isEmpty()) {
      System.out.println("The list is empty");
    } else {
      // se la lista non è vuota calcolo la somma e la stampo a video
      int sum = 0;
      for (Integer n : numbers) {
        sum += n;
      }
      System.out.println("The sum is " + sum);
    }

    // Genero una nuova lista che contiene solo i numeri pari della lista di partenza
    List<Integer> evenNumbers = new ArrayList<>();
    // itero sulla lista base e copio nella nuova lista solo i numeri pari
    for (Integer n : numbers) {
      if (n % 2 == 0) {
        evenNumbers.add(n);
      }
    }
    System.out.println("Only even numbers: " + evenNumbers);

    scan.close();
  }
}
