package org.learning.java.variables;

import java.util.Scanner;

public class OperatingSystemSurvey {

  public static void main(String[] args) {
    // declare a Scanner
    Scanner keyboardReader = new Scanner(System.in);

    // number of users per operating system
    int macUsers = 5;
    int windowsUsers = 20;
    int linuxUser = 1;

    // override number of users from keyboard input
    System.out.print("Insert Mac users: ");
    macUsers = keyboardReader.nextInt();
    System.out.print("Insert Windows users: ");
    windowsUsers = keyboardReader.nextInt();
    System.out.print("Insert Linux users: ");
    linuxUser = keyboardReader.nextInt();

    // total users
    int totalUsers = macUsers + windowsUsers + linuxUser;
    System.out.println("Total users: " + totalUsers);

    // percentage of mac users
    double percMac = ((double) macUsers / totalUsers) * 100; //(5.0/26)*100
    // percentage of windows users
    double percWindows = ((double) windowsUsers / totalUsers) * 100;
    // percentage of linux users
    double percLinux = ((double) linuxUser / totalUsers) * 100;

    System.out.println("Percentage Mac: " + percMac);
    System.out.println("Percentage Windows: " + percWindows);
    System.out.println("Percentage Linux: " + percLinux);

    // Which operating systems are most used
  /*  double maxMacWindows = Math.max(percMac, percWindows);
    double max = Math.max(percLinux, maxMacWindows);

    System.out.println("Max percentage: " + max);*/

    int maxUsers = Math.max(macUsers, Math.max(windowsUsers, linuxUser));
    System.out.println("Max users: " + maxUsers);
    String result = "The most used OS:";
    if (maxUsers == macUsers) {
      result += " Mac";
    }
    if (maxUsers == windowsUsers) {
      result += " Windows";
    }
    if (maxUsers == linuxUser) {
      result += " Linux";
    }

    System.out.println(result);
    

  }


}
