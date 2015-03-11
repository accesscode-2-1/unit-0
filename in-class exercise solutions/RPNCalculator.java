/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class translates Reverse Polish notation to an infix expression and
 * evaluates it. See: http://en.wikipedia.org/wiki/Reverse_Polish_notation.
 */

import java.util.Scanner;

public class RPNCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        double num1 = in.nextDouble();
        System.out.print("Please enter the second number: ");
        double num2 = in.nextDouble();
        System.out.print("Please enter an operator: ");
        String operator = in.next();

        if (operator.equals("+")) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1+num2));
        } else if (operator.equals("-")) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1-num2));
        } else if (operator.equals("/")) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1*num2));
        } else if (operator.equals("*")) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1/num2));
        }
    }
}
