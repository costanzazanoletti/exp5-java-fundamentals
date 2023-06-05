package org.learning.java.oop.auto;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Auto miaAuto = new Auto();
    System.out.println(miaAuto.getDati());

    miaAuto.colore = "bianco";
    miaAuto.annoImmatricolazione = 2020;
    miaAuto.marca = "Toyota";
    miaAuto.ibrida = true;

    Auto autoDiFedez = new Auto();
    autoDiFedez.colore = "argento";
    autoDiFedez.annoImmatricolazione = 2023;
    autoDiFedez.marca = "Lamborghini";
    autoDiFedez.ibrida = false;

    System.out.println(miaAuto.getDati());
    System.out.println(autoDiFedez.getDati());

    Scanner scan = new Scanner(System.in);
    System.out.print("Colore: ");
    String colore = scan.nextLine();
    System.out.print("Marca: ");
    String marca = scan.nextLine();
    System.out.print("Anno immatricolazione: ");
    int annoImmatricolazione = scan.nextInt();
    System.out.print("Ibrida(s/n): ");
    boolean ibrida = scan.nextLine().equalsIgnoreCase("s");

    Auto autoUtente = new Auto(colore, marca, annoImmatricolazione, ibrida);

  }
}
