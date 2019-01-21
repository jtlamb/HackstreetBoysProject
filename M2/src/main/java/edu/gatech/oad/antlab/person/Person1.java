package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Jacob Lambert
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  char[] arr = input.toCharArray();
	  char one = input.charAt(0);
	  char two = input.charAt(1);
	  for (int i = 0; i < input.length() - 2; i++) {
	      arr[i] = arr[i+2];
      }
      arr[input.length()-2] = one;
	  arr[input.length()-1] = two;
	  String fin = "";
	  for (int i = 0; i < input.length(); i++) {
	      fin += arr[i];
      }
	  return fin;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
