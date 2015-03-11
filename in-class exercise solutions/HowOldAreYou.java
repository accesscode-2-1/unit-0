/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class asks for the user's age and then tells them what they can or
 * cannot do.
 */

import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hey, what's your name? ");
        String name = in.next();

        System.out.print("Ok, " + name + ", how old are you? ");
        short age = in.nextShort();

        // Check the user's age with an increasing threshold to ensure we
        // print all possible responses.
        if (age < 16) {
            System.out.println("You can't drive, " + name);
        }
        if (age < 18) {
            System.out.println("You can't vote, " + name);
        }
        if (age < 25) {
            System.out.println("You can't rent a car, " + name);
        }
        if (age >= 25) {
            System.out.println("You can do anything that's legal, " + name);
        }
    }
}
