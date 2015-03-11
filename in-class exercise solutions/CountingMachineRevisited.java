/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class asks the user for three integers representing:
 * 1. An initial value.
 * 2. A maximum value.
 * 3. An value by which to increment.
 *
 * It then counts from the initial value to the maximum value and increments
 * based by the final value
 */

import java.util.Scanner;

public class CountingMachineRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Count from: ");
        int from = in.nextInt();

        System.out.print("Count to  : ");
        int to = in.nextInt();

        System.out.print("Count by  : ");
        int by = in.nextInt();

        for (int i = from; i <= to; i = i + by) {
            System.out.print(i + " ");
        }
    }
}