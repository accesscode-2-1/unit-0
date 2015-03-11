/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class counts from 0 to 100, replacing any number divisible by 3 with
 * the word "Fizz" and any word divisible by 5 with "Buzz". See:
 * http://en.wikipedia.org/wiki/Fizz_buzz.
 */

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}