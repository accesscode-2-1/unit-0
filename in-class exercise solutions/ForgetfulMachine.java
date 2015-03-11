/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class asks the user for several inputs but ignores them all.
 */

import java.util.Scanner;

public class ForgetfulMachine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a word! ");
        in.next();

        System.out.println("Give me another word!");
        in.next();

        // Print an extra line before asking for more input.
        System.out.println();
        System.out.println("Great, now your favorite number?");
        in.nextInt();

        System.out.println("And your second-favorite number...");
        in.nextInt();

        System.out.println();
        System.out.println("Whew!  Wasn't that fun?");
    }
}