/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class adds 3 user-supplied numbers together and divides the sum by 2.
 */

import java.util.Scanner;

public class DumbCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your first number? ");
        double first = in.nextDouble();
        System.out.print("What is your second number? ");
        double second = in.nextDouble();
        System.out.print("What is your third number? ");
        double third = in.nextDouble();

        double answer = (first + second + third) / 2;
        String response = "( " + first + " + " + second + " + " + third + " ) / 2 is... " + answer;
        System.out.println(response);
    }
}