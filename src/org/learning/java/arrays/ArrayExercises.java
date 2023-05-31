package org.learning.java.arrays;

import java.util.Arrays;

public class ArrayExercises {

  public static void main(String[] args) {
    String[] weekDays = {"Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun"};
    // print in console [Mon, Tue, Wen, Thu, Fri, Sat, Sun]
    String result = "[";
    for (int i = 0; i < weekDays.length; i++) {
      result += weekDays[i];
      // solo se non è l'ultima iterazione
      if (i < weekDays.length - 1) {
        result += ", ";
      }
    }
    result += "]";
    System.out.println(result);

    System.out.println(Arrays.toString(weekDays));
    System.out.println("The last day is " + weekDays[weekDays.length - 1]);

    int[] numbers = new int[5];
    numbers[0] = 9;
    numbers[1] = 15;
    System.out.println(Arrays.toString(numbers));

    String[] empty = new String[10];
    // empty[10] = "Ciao";Runtime error
    System.out.println(Arrays.toString(empty));
  }
}
