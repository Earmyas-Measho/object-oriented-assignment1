package assignmentone;

import java.util.Scanner;

/**
 * The HelloThere class.
 * 
 */
class HelloThere {

  /**
   * This method is for returning hello there and the name of the parameter.
   *
   * @param name giving name as an inpute for calling the method.
   *
   * @return return hello and the name.
   * 
   */

  public String hello(String name) {
    return "Hello there, " + name;
  }

  /**
   * The main.
   *
   * @param args command line arguments.
   * 
   */

  public static void main(String[] args) {
    HelloThere helloThere = new HelloThere();
    Scanner sc = new Scanner(System.in);
    System.out.print("Name, please: ");
    String name = sc.nextLine();
    System.out.println(helloThere.hello(name));
    sc.close();
  }
}
