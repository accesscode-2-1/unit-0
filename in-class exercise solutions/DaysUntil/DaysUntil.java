/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class asks the user for their birthday and tells them how many days
 * there are until it.
 *
 * It does not account for leap years.
 */

import java.util.Calendar;
import java.util.Scanner;

public class DaysUntil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int thisYear = calendar.get(Calendar.YEAR);
        // Account for the Calendar's silly API.
        int thisMonth = calendar.get(Calendar.MONTH)+1;
        int thisDay = calendar.get(Calendar.DATE);
        int numDaysThisYear = calendar.get(Calendar.DAY_OF_YEAR);

        System.out.println("Please enter your birthday:");
        System.out.print("What is the month (1-12): ");
        int birthMonth = in.nextInt();
        System.out.print("What is the day   (1-31): ");
        int birthDay = in.nextInt();

        calendar.set(thisYear, birthMonth-1, birthDay);
        int numDaysBirthday = calendar.get(Calendar.DAY_OF_YEAR);

        // Handle negative remainder.
        // See http://stackoverflow.com/a/4412200/1830334.
        int a = numDaysBirthday - numDaysThisYear;
        int b = 365;
        int daysUntil = (a % b + b) % b;
        System.out.println("Your birthday is in " + daysUntil + " days");
    }
}