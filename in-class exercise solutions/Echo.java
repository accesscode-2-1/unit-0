/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class repeats a user's input back to them.
 */

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        // Instantiate a new Scanner.
        Scanner in = new Scanner(System.in);

        // Prompt the user for input.
        System.out.print("Please say something: ");

        // Read in the next *full line*.
        String userInput = in.nextLine();

        // Repeat the String back to them.
        System.out.println(userInput);
    }
}