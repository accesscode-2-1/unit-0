/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class counts from 0 to a user-defined maximum value.
 */

import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args) {
        // Read in the user's maximum value.
        Scanner in = new Scanner(System.in);
        System.out.print("Count to: ");
        int max = in.nextInt();

        // Start at 0.
        // Continue while less than max.
        // Increment by 1 on every loop.
        for (int i = 0; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}