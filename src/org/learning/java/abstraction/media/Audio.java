package org.learning.java.abstraction.media;

public class Audio extends Media implements Playable, HasVolume {

  private final static int DEFAULT_VOLUME = 5;
  private final static int MAX_VOLUME = 10;
  private final static int MIN_VOLUME = 0;
  private int volume;

  public Audio(String title) {
    super(title);
    volume = DEFAULT_VOLUME;
  }

  @Override
  public void louder() {
    if (volume < MAX_VOLUME) {
      volume++;
    } else {
      System.out.println("Max volume reached");
    }
  }

  @Override
  public void weaker() {
    if (volume > MIN_VOLUME) {
      volume--;
    } else {
      System.out.println("Min volume reached");
    }
  }

  @Override
  public void printVolume() {
    System.out.println("Volume: " + volume);
  }

  @Override
  public void execute() {
    play();
  }

  @Override
  public void play() {
    for (int i = 0; i < volume; i++) {
      System.out.print(getTitle());
    }
  }
}
