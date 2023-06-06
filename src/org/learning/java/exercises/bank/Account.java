package org.learning.java.exercises.bank;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class Account {

  // FIELDS
  private int accountNumber;
  private String owner;
  private BigDecimal balance;

  // CONSTRUCTORS
  public Account(String owner) {
    this.owner = owner;
    this.balance = new BigDecimal(0);
    this.accountNumber = generateCode();
  }


  // GETTERS & SETTERS
  public int getAccountNumber() {
    return accountNumber;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  // METHODS
  public void deposit(BigDecimal amount) {
    balance = balance.add(amount);
  }

  public void withdraw(BigDecimal amount) {
    // check balance >= amount
    if (balance.compareTo(amount) >= 0) {
      balance = balance.subtract(amount);
    } else {
      System.out.println("The amount is greater than the balance");
    }
  }

  public String getFormattedBalance() {
    DecimalFormat df = new DecimalFormat("0.00€");
    return df.format(balance);
  }

  private int generateCode() {
    Random rand = new Random();
    return rand.nextInt(1000);
  }

  @Override
  public String toString() {
    return "Account{" +
        "accountNumber=" + accountNumber +
        ", owner='" + owner + '\'' +
        ", balance=" + balance +
        '}';
  }
}
