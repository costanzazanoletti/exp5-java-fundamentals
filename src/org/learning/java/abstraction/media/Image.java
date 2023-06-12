package org.learning.java.abstraction.media;

public class Image extends Media implements HasBrightness {

  public final static int DEFAULT_BRIGHTNESS = 5;
  public final static int MAX_BRIGHTNESS = 10;
  public final static int MIN_BRIGHTNESS = 0;

  private int brightness;

  public Image(String title) {

    super(title);
    this.brightness = DEFAULT_BRIGHTNESS;
  }

  @Override
  public void lighter() {
    if (brightness > MIN_BRIGHTNESS) {
      brightness--;
    } else {
      System.out.println("Minimum brightness reached");
    }
  }

  @Override
  public void darker() {
    if (brightness < MAX_BRIGHTNESS) {
      brightness++;
    } else {
      System.out.println("Maximum brightness reached");
    }
  }

  @Override
  public void printBrightness() {
    System.out.println("Current brightness: " + brightness);
  }

  @Override
  public void execute() {
    show();
  }

  public void show() {
    String show = getTitle();
    for (int i = 0; i < brightness; i++) {
      show += "*";
    }
    System.out.println(show);
  }
}
