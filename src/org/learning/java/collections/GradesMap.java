package org.learning.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GradesMap {

  public static void main(String[] args) {

    // mappa dei voti
    Map<String, Integer> grades = new HashMap<>();
    grades.put("Will", 7);
    grades.put("Max", 6);
    grades.put("Dustin", 10);
    grades.put("Nancy", 5);
    System.out.println(grades);
    System.out.println("Number of records: " + grades.size());

    System.out.println(grades.containsKey("Nancy"));
    grades.put("Nancy", 6);
    System.out.println(grades);
    grades.remove("Nancy");
    System.out.println(grades);

    System.out.println(grades.containsValue(10) ? "Someone has 10" : "No one has 10");

    Set<String> keys = grades.keySet();
    Collection<Integer> values = grades.values();

    Iterator<String> mapIterator = keys.iterator();
    while (mapIterator.hasNext()) {
      String currentKey = mapIterator.next();
      System.out.println(currentKey + " grade " + grades.get(currentKey));
    }

    Set<Entry<String, Integer>> entries = grades.entrySet();
    Iterator<Entry<String, Integer>> entryIterator = entries.iterator();
    while (entryIterator.hasNext()) {
      Entry<String, Integer> e = entryIterator.next();
      System.out.println(e);
      String key = e.getKey();
      Integer value = e.getValue();
    }

  }
}
