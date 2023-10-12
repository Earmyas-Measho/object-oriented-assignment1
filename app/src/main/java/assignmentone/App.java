package assignmentone;

import java.util.Scanner;

/**
 * The App class contains methods that interact with user input and output on
 * the console.
 */

public class App {
  private Scanner input;

  /** 
   * Constructor that initializes the Scanner object.
   *
   * @param scannerInput The Scanner object used for user input.
   */
  private App(Scanner scannerInput) {
    this.input = scannerInput;
  }

  /** 
   * Prompts the user for their name and prints a personalized greeting.
   */

  public void helloThere() {
    System.out.print("What is your name? ");
    String name = input.nextLine();

    HelloThere helloThere = new HelloThere();
    System.out.println(helloThere.hello(name));
  }

  /**
   * Prompts the user for hours, minutes, and seconds, and calculates the total
   * seconds.
   */

  public void seconds() {
    System.out.print("Enter hours, minutes and seconds: ");
    int hours = input.nextInt();
    System.out.print("Enter minutes and seconds: ");
    int minutes = input.nextInt();
    System.out.print("Enter seconds: ");
    int seconds = input.nextInt();

    Time time = new Time();
    System.out.println("In only seconds that is: " + time.toSeconds(hours, minutes, seconds));
  }

  /**
   * Creates an Album object with a fixed set of properties and prints the
   * details.
   */

  public void imInaBand() {
    Album album = new Album("Wish You Were Here", 1975, "Pink Floyd");
    System.out.println(album.getName() + " was released in " + album.getYear() + " by " + album.getArtist());
  }

  /**
   * Generates an array of Album objects and prints their details.
   */

  public void bestAlbumsEver() {
    AlbumGenerator albumGenerator = new AlbumGenerator();
    Album[] albums = albumGenerator.generateAlbums();

    for (Album album : albums) {
      System.out.println(album.getName() + " was released in " + album.getYear() + " by " + album.getArtist());
    }
  }

  /**
   * Contains methods that perform operations on an integer array and prints the
   * results.
   */

  public void workingWithArrays() {
    ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms();
    int[] arr = { 5, 2, 6, 4, 1, 3, 7, 9, 8 };

    System.out.println("Average is: " + arrayAlgorithms.average(arr));
    System.out.println("Largest value is: " + arrayAlgorithms.maxValue(arr));
    System.out.println("Index of smallest value is at position: " + arrayAlgorithms.minIndex(arr));

    int[] shiftedArr = arrayAlgorithms.shift(arr);
    System.out.print("Shifted array: ");
    for (int i : shiftedArr) {
      System.out.print(i + " ");
    }
    System.out.println();

    int[] shuffledArr = arrayAlgorithms.shuffle(arr);
    System.out.print("Shuffled array: ");
    for (int i : shuffledArr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  /** 
   * The main method that initializes the App object and calls its methods.
   *
   * @param args Command line arguments, not used.
   */

  public static void main(String[] args) {
    Scanner consoleInput = new Scanner(System.in, "UTF-8");

    App app = new App(consoleInput);

    app.helloThere();
    app.seconds();
    app.imInaBand();
    app.bestAlbumsEver();
    app.workingWithArrays();

    consoleInput.close();
  }
}
