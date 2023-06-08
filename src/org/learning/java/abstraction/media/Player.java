package org.learning.java.abstraction.media;

public class Player {


  public static void main(String[] args) {
    Media[] playlist = new Media[5];
    // valorizzo con Audio, Video e Image a scelta dell'utente

    for (Media m : playlist) {
      m.execute();
    }
  }
}
