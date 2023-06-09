package org.learning.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Data una parola definita dall'utente stampare per ogni carattere della parola quante occorrenze
 * programma
 * p:1
 * r:2
 * o:1
 * g:1
 * a:2
 * m:2
 * */
public class CharCount {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Dimmi una parola: ");
    String word = scan.nextLine();
    // trasformo la stringa in un array di char
    char[] chars = word.toCharArray();
    Map<Character, Integer> charSet = new HashMap<>();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      // se il carattere è già presente nella mappa aumento il value di 1
      if (charSet.containsKey(c)) {
        int currentValue = charSet.get(c); // valore corrente
        currentValue++; // aumento di 1 il valore corrente
        charSet.put(c, currentValue); // sostituisco nella mappa il vecchio record
      } else {
        // se il carattere non è presente lo inserisco nella mappa con value 1
        charSet.put(c, 1);
      }
    }
    System.out.println(charSet);
    scan.close();
  }
}
