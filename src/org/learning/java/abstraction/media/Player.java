package org.learning.java.abstraction.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // lista dei media (Immagini, Video e Audio)
    List<Media> media = new ArrayList<>();

    // costruisco la lista di media
    boolean stop = false;
    do {
      System.out.println("Insert new media?(Y/N)");
      String choice = scan.nextLine();

      switch (choice.toUpperCase()) {
        case "Y":
          System.out.print("Title: ");
          String title = scan.nextLine();
          System.out.print("Type of media (I-Image, V-Video, A-Audio): ");
          String mediaType = scan.nextLine();
          switch (mediaType.toUpperCase()) {
            case "I": // Image
              media.add(new Image(title));
              break;
            case "V": // Video
              media.add(new Video(title));
              break;
            case "A": // Audio
              media.add(new Audio(title));
              break;
            default:
              System.out.println("Invalid media type");
              break;
          }
          // add media to list
          break;
        case "N":
          stop = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }

    } while (!stop);

    // stampo tutti i media
    System.out.println("Your list of media: ");
    for (Media m : media) {
      System.out.println(m);
    }
    // scelta dell'elemento da eseguire
    int n;
    do {
      System.out.println("Reproduce element (1-" + media.size() + "), 0 to exit");
      n = Integer.parseInt(scan.nextLine());
      // riproduco l'elemento scelto
      if (n > 0 && n <= media.size()) {
        Media currentMedia = media.get(n - 1);
        currentMedia.execute();
        System.out.println();
        // regolare parametri
        if (currentMedia instanceof HasVolume) {
          System.out.print("Do you want to change the volume?(+|-)");
          String change = scan.nextLine();
          // implementazione
          switch (change) {
            case "+":
              // increase
              ((HasVolume) currentMedia).louder();
              break;
            case "-":
              // decrease
              ((HasVolume) currentMedia).weaker();
              break;
            default:
              break;
          }
          ((HasVolume) currentMedia).printVolume();
        }
        if (currentMedia instanceof HasBrightness) {
          System.out.print("Do you want to change the brightness?(+|-)");
          String change = scan.nextLine();
          // implementazione
          switch (change) {
            case "+":
              // increase
              ((HasBrightness) currentMedia).lighter();
              break;
            case "-":
              // decrease
              ((HasBrightness) currentMedia).darker();
              break;
            default:
              break;
          }
          ((HasBrightness) currentMedia).printBrightness();
        }
      } else if (n == 0) { // 0 per exit
        System.out.println("Bye bye");
      } else {
        System.out.println("Invalid number");
      }
    } while (n != 0);
  }
}
