package org.learning.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
/*    BigDecimal[] prices = new BigDecimal[10];

    ArrayList<BigDecimal> dynamicPrices = new ArrayList<>();

    dynamicPrices.add(new BigDecimal(0));*/
    String[] namesArray = new String[]{"pippo", "pluto"};
    for (int i = 0; i < namesArray.length; i++) {
      System.out.println(namesArray[i]);
    }
    System.out.println("-------------------");
    ArrayList<String> names = new ArrayList<>();
    System.out.println(names);
    names.add("Max");
    names.add("Will");
    names.add("Lucas");
    System.out.println(names);
    for (int i = 0; i < names.size(); i++) {
      // stampo l'elemento alla posizione i
      String element = names.get(i);
      System.out.println(element);
    }
    // ordino la collection
    Collections.sort(names);
    System.out.println(names);

    // Boxing unboxing
    Integer num = 5;
    Boolean bool = true;
    Double dob = 5.5;

    int x = num;
    System.out.println("*****************");
    Set<Integer> integers = new HashSet<>();
    integers.add(10);
    integers.add(5);
    System.out.println(integers.add(999));
    System.out.println(integers.add(999));
    System.out.println(integers);
    integers.remove(5);
    System.out.println(integers);
    // iteriamo sul set con Iterator
    System.out.println("Gli elementi del set sono");
    Iterator<Integer> iterator = integers.iterator();
    while (iterator.hasNext()) {
      int element = iterator.next();
      System.out.println(element);
    }

    // Differenza tra ciclo for-each e for-1 per array
    int[] numArray = new int[]{3, 5, 7, 9};
    System.out.println(Arrays.toString(numArray));
    for (int n : numArray) {
      n = n * 2;
    }
    System.out.println(Arrays.toString(numArray));
    for (int i = 0; i < numArray.length; i++) {
      numArray[i] = numArray[i] * 2;
    }
    System.out.println(Arrays.toString(numArray));
  }
}
