/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class asks the user for their birthday and tells them how many days
 * there are until it.
 *
 * It accounts for leap years.
 */

import java.util.Calendar;
import java.util.Scanner;

public class DaysUntilWLD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int thisYear = calendar.get(Calendar.YEAR);
        // Account for the Calendar's silly API.
        int thisMonth = calendar.get(Calendar.MONTH)+1;
        int thisDay = calendar.get(Calendar.DATE);
        int daysThisYear = calendar.get(Calendar.DAY_OF_YEAR);

        System.out.println("Please enter your birthday:");
        System.out.print("What is the month (1-12): ");
        int birthMonth = in.nextInt();
        System.out.print("What is the day   (1-31): ");
        int birthDay = in.nextInt();

        int daysUntil;

        // If their birthday is in the next year, then either the current year
        // or the next may be a leap year. Account for both possibilities.
        if ((thisMonth == birthMonth && thisDay > birthDay) ||
            (thisMonth > birthMonth)) {

            int nextYear = thisYear + 1;
            // Account for leap year in this year manually.
            int daysInYear = 365 + getLeapDay(thisYear);
            // Account for leap year in the next using the Calendar API.
            calendar.set(nextYear, birthMonth-1, birthDay);
            int daysTilBirthday = calendar.get(Calendar.DAY_OF_YEAR);
            daysUntil = (daysInYear - daysThisYear) + daysTilBirthday;

        // If the birthday is in the current year, we let the Calendar API
        // handle leap days.
        } else {
            calendar.set(thisYear, birthMonth-1, birthDay);
            int daysTilBirthday = calendar.get(Calendar.DAY_OF_YEAR);
            daysUntil = daysThisYear - daysTilBirthday;
        }

        System.out.println("Your birthday is in " + daysUntil + " days");
    }

    // See http://en.wikipedia.org/wiki/Leap_year#Algorithm.
    public static int getLeapDay(int year) {
        int leapDay = 0;
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            leapDay = 1;
        } else {
            leapDay = 0;
        }
        return leapDay;
    }
}