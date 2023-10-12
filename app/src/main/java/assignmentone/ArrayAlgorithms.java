package assignmentone;

import java.util.Random;

/*
 *
 * This class performs operations on integer arrays.
 * 
 */

class ArrayAlgorithms {
  /**
   * Computes the average value of integers in the array.
   *
   * @param array The array to be used in the method.
   *
   * @return Returns the average value of the given array.
   *
   */

  public double average(int[] array) {
    int sum = 0;
    for (int i : array) {
      sum += i;
    }
    return (double) sum / array.length;
  }

  /**
   * Finds the max value in the array.
   *
   * @param array The array in the parameter to be used in the function.
   *
   * @return Returns the max value in the array.
   *
   */

  public int maxValue(int[] array) {
    int max = array[0];
    for (int i : array) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  /**
   * Detects the index of the smallest value in the array.
   *
   * @param array The given array to be used in the method.
   *
   * @return Returns the index of the minimum value from the array.
   *
   */

  public int minIndex(int[] array) {
    int min = array[0];
    int minIndex = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

  /**
   * Shifts the elements of the array to the left by one.
   *
   * @param array The array to be used in the function.
   *
   * @return Returns a shifted array by one.
   *
   */

  public int[] shift(int[] array) {
    int first = array[0];
    for (int i = 0; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[array.length - 1] = first;
    return array;
  }

  /**
   * Randomly shuffles an element in the array.
   *
   * @param array The array to be given for the function.
   *
   * @return Returns a shuffled array.
   *
   */

  public int[] shuffle(int[] array) {
    Random rand = new Random();
    for (int i = 0; i < array.length; i++) {
      int randomIndex = rand.nextInt(array.length);
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
    return array;
  }

  /**
   * the main method.
   *
   * @param args The command line arguments.
   *
   */

  public static void main(String[] args) {
    int[] array = { 5, 2, 6, 4, 1, 3, 7, 9, 8 };
    System.out.println("Original array: ");
    for (int i : array) {
      System.out.print(i + " ");
    }
    ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms();

    System.out.println();
    System.out.println("Average is: " + arrayAlgorithms.average(array));
    System.out.println("Largest value is: " + arrayAlgorithms.maxValue(array));
    System.out.println("Index of smallest value is at position: "
        + arrayAlgorithms.minIndex(array));
    System.out.println("Shifted array: ");
    int[] shiftedArray = arrayAlgorithms.shift(array);
    for (int i : shiftedArray) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("Shuffled array: ");
    int[] shuffledArray = arrayAlgorithms.shuffle(shiftedArray);
    for (int i : shuffledArray) {
      System.out.print(i + " ");
    }
  }
}
