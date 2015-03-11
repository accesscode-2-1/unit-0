/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class verifies a user's password against a password stored in the
 * program.
 */

import java.util.Scanner;

public class PasswordVerifier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the password?");
        String realPassword = "1234";
        String userPassword = in.nextLine();

        // String.equals() compares if the values of the two strings are the
        // same. See: http://stackoverflow.com/a/767379/1830334.
        if (userPassword.equals(realPassword)) {
            System.out.println("Logged in.");
        } else {
            System.out.println("Sorry, wrong password.");
        }
    }
}