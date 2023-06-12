package org.learning.java.abstraction.media;

public class Video extends Media implements Playable, HasVolume, HasBrightness {

  private final static int DEFAULT_VOLUME = 0;
  private final static int MAX_VOLUME = 100;
  private final static int MIN_VOLUME = -100;
  private final static double DEFAULT_BRIGHTNESS = 0.5;
  private final static double MAX_BRIGHTNESS = 0.9;
  private final static double MIN_BRIGHTNESS = 0.0;

  private int volumeLevel;
  private double brightnessLevel;

  public Video(String title) {
    super(title);
    volumeLevel = DEFAULT_VOLUME;
    brightnessLevel = DEFAULT_BRIGHTNESS;
  }

  @Override
  public void lighter() {
    if (brightnessLevel < (MAX_BRIGHTNESS - 0.1)) {
      brightnessLevel += 0.1;
    } else {
      System.out.println("Max brightness reached");
    }
  }

  @Override
  public void darker() {
    if (brightnessLevel > (MIN_BRIGHTNESS + 0.1)) {
      brightnessLevel -= 0.1;
    } else {
      System.out.println("Min brightness reached");
    }
  }

  @Override
  public void printBrightness() {
    System.out.println("Current brightness level " + brightnessLevel);
  }

  @Override
  public void louder() {
    if (volumeLevel < (MAX_VOLUME - 10)) {
      volumeLevel += 10;
    } else {
      System.out.println("Max volume reached");
    }
  }

  @Override
  public void weaker() {
    if (volumeLevel > (MIN_VOLUME + 10)) {
      volumeLevel -= 10;
    } else {
      System.out.println("Min volume reached");
    }
  }

  @Override
  public void printVolume() {
    System.out.println("Current volume level is " + volumeLevel);
  }

  @Override
  public void execute() {
    play();
  }

  @Override
  public void play() {
    for (int i = MIN_VOLUME; i < volumeLevel; i += 10) {
      String print = getTitle();
      for (int j = 0; j < ((int) (brightnessLevel * 10)); j++) {
        print += "*";
      }
      System.out.print(print);
    }
  }
}
