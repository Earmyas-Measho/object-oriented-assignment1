package assignmentone;

import java.util.Scanner;

/**
 * class convert time that are in hours, minutes and seconds to seconds.
 * 
 */

public class Time {

  /**
   * .
   * This method is used to convert time in hours, minutes and seconds to seconds.
   *
   * @param hours   hours
   * 
   * @param minutes minutes
   * 
   * @param seconds seconds
   * 
   * @return total seconds
   * 
   */

  public int toSeconds(int hours, int minutes, int seconds) {
    return (hours * 3600) + (minutes * 60) + seconds;
  }

  /**
   * The main method.
   */
  public static void main(String[] args) {
    Time time = new Time();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter hours, minutes, and seconds separated by space : ");
    int hours = sc.nextInt();
    int minutes = sc.nextInt();
    int seconds = sc.nextInt();
    int totalSeconds = time.toSeconds(hours, minutes, seconds);
    System.out.println("In only seconds that is: " + totalSeconds);
    sc.close();
  }
}
