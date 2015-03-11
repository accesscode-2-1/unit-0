/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class calculates a user's Body Mass Index after reading in the user's
 * height in meters and mass in kilograms.
 */

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Your height in m: ");
        double height = in.nextDouble();

        System.out.print("Your weight in kg: ");
        double mass = in.nextDouble();

        // BMI is mass divided by the square root of height. See:
        // http://en.wikipedia.org/wiki/Body_mass_index.
        double bmi = mass / (height * height);

        System.out.println("Your BMI is " + bmi);
    }
}