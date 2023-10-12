package assignmentone;

/**
 * The StringArray class represents a collection of words stored as an array of
 * strings.
 * It provides methods for finding the longest word, shortest word, most common
 * character,
 * and a backwards version of a given sentence.
 */

public class StringArray {
  private String[] myStrings;

  /**
   * Constructs a StringArray object from the given string, splitting it into
   * individual words using spaces as delimiters.
   *
   * @param s the string to be split into words
   */
  public StringArray(String s) {
    if (s != null && !s.isEmpty()) {
      myStrings = s.split(" ");
    }
  }

  /**
   * Finds and returns the longest word in the array of strings.
   *
   * @return the longest word in the array, or null if the array is empty
   */

  public String longestWord() {
    if (myStrings == null) {
      return null;
    }

    String longest = myStrings[0];
    for (String word : myStrings) {
      if (word.length() > longest.length()) {
        longest = word;
      }
    }
    return longest;
  }

  /**
   * Finds and returns the shortest word in the array of strings.
   *
   * @return the shortest word in the array, or null if the array is empty
   */

  public String shortestWord() {
    if (myStrings == null) {
      return null;
    }

    String shortest = myStrings[0];
    for (String word : myStrings) {
      if (word.length() < shortest.length()) {
        shortest = word;
      }
    }
    return shortest;
  }

  /**
   * Finds and returns the most common character in all the words of the array.
   *
   * @return the most common character, or '\0' if the array is empty
   */
  public char mostCommonCharacter() {
    if (myStrings == null) {
      return '\0';
    }

    int[] charCount = new int[256];
    for (String word : myStrings) {
      for (int i = 0; i < word.length(); i++) {
        charCount[word.charAt(i)]++;
      }
    }

    int maxCount = -1;
    char mostCommon = '\0';
    for (int i = 0; i < charCount.length; i++) {
      if (charCount[i] > maxCount) {
        maxCount = charCount[i];
        mostCommon = (char) i;
      }
    }
    return mostCommon;
  }

  /**
   * Returns a reversed version of the input sentence, with the first and last
   * words capitalized and lowercase respectively,
   * and the rest of the words in lowercase.
   *
   * @return the backwards version of the input sentence, or null if the array is
   *         empty
   */
  public String backwards() {
    if (myStrings == null) {
      return null;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = myStrings.length - 1; i >= 0; i--) {
      if (i == myStrings.length - 1) {
        sb.append(Character.toUpperCase(myStrings[i].charAt(0)));
        sb.append(myStrings[i].substring(1).toLowerCase());
      } else if (i == 0) {
        sb.append(Character.toLowerCase(myStrings[i].charAt(0)));
        sb.append(myStrings[i].substring(1));
      } else {
        sb.append(myStrings[i]);
      }
      if (i != 0) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }

  /**
   * .
   * Main method that creates a StringArray object from the input sentence, and
   * demonstrates how to use the class methods
   * to find the longest word, shortest word, most common character, and backwards
   *
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    StringArray sa = new StringArray("Shine on you crazy diamond");
    System.out.println("Sentence: " + String.join(" ", sa.myStrings));
    System.out.println(sa.longestWord());
    System.out.println(sa.shortestWord());
    System.out.println(sa.mostCommonCharacter());
    System.out.println(sa.backwards());
  }
}
