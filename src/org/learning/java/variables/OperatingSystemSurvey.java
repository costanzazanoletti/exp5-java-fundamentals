package org.learning.java.variables;

public class OperatingSystemSurvey {

  public static void main(String[] args) {
    // number of users per operating system
    int macUsers = 5;
    int windowsUsers = 20;
    int linuxUser = 1;

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
    

  }

}
