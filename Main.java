/*
 * Assignment 1, Question 2
 * Jennifer Carr, 672-249317
 */

package assignoneques2;

/**
 * write an application that displays the integer equivalents of some uppercase
 * letter, lowercase letter, digits and special symbols
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);

      //get user to input a character
      System.out.print ("Please enter a character to be converted ");
      char user = input.next().charAt(0);


       int ascii = user;
       System.out.print("Character " + user + " has a value of " + ascii + " "); //print the value  of the character

    }//end main method
}//end main class
