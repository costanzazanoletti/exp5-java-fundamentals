package org.learning.java.snacks;

public class Snack7 {

  /* Stampa le potenze di 2 fino a 100
   * power = n^exp (se exp 3 -> n*n*n)
   * 2^0=1, 2^1=2, 2^2=2*2, 2^3=2*2*2, 2^4=2*2*2*2
   *  */
  public static void main(String[] args) {
    System.out.println("Potenze di 2 fino a 100");
    long power = 1;
    /*
    for (int i = 0; i <= 100; i++) {
      if (i > 0) {
        power = power * 2; // power *= 2
      }
      System.out.println("2^" + i + "=" + power);
    }*/
    int exp = 0;

    while (power * 2 < 1000) {
      if (exp > 0) {
        power = power * 2; // power *= 2
      }
      System.out.println("2^" + exp + "=" + power);
      exp++;
    }
  }

}
