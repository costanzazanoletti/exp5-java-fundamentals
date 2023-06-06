package org.learning.java.exercises.bank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("WELCOME TO JAVA BANK");
    System.out.print("Your name: ");
    String name = scan.nextLine();
    Account account = new Account(name);
    System.out.println(account);

    boolean exit = false;
    do {
      System.out.println("What do you want to do?");
      System.out.println("1-Deposit 2-Withdaw 3-Exit");
      String choice = scan.nextLine();
      switch (choice) {
        case "1":
          // deposit
          System.out.println("Deposit");
          System.out.print("Amount: ");
          BigDecimal depositAmount = new BigDecimal(scan.nextLine());
          account.deposit(depositAmount);
          System.out.println("Your balance is " + account.getFormattedBalance());
          break;
        case "2":
          // withdraw
          System.out.println("Withdraw");
          System.out.print("Amount: ");
          BigDecimal withdrawAmount = new BigDecimal(scan.nextLine());
          account.withdraw(withdrawAmount);
          System.out.println("Your balance is " + account.getFormattedBalance());
          break;
        case "3":
          // exit;
          System.out.println("Bye Bye");
          exit = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (!exit);

    scan.close();
  }
}
