/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class asks the user two personal questions and repeats the information
 * back to them.
 */

import java.util.Scanner;

public class AskingQuestions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Store the user's input into our variables, calling correct Scanner
        // method depending on the type we expect.
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.print("How old are you? ");
        int age = in.nextInt();

        // Repeat the user's personal information back to them.
        System.out.println("So your name is " + name + " and you are " + age + "-years-old.");
    }
}