import java.util.Calendar;
import java.util.Scanner;

public class DaysUntilBirthday {

    public static int getDayOfYear(int day, int month, int leapDay) {
        if (month == 1) {
            return 0 + day;
        } else if (month == 2) {
            return 31 + day;
        } else if (month == 3) {
            return 59 + day + leapDay;
        } else if (month == 4) {
            return 90 + day + leapDay;
        } else if (month == 5) {
            return 120 + day + leapDay;
        } else if (month == 6) {
            return 151 + day + leapDay;
        } else if (month == 7) {
            return 181 + day + leapDay;
        } else if (month == 8) {
            return 212 + day + leapDay;
        } else if (month == 9) {
            return 243 + day + leapDay;
        } else if (month == 10) {
            return 273 + day + leapDay;
        } else if (month == 11) {
            return 304 + day + leapDay;
        } else {
            return 334 + day + leapDay;
        }
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int thisYear = calendar.get(Calendar.YEAR);
        // Account for the Calendar's silly API.
        int thisMonth = calendar.get(Calendar.MONTH)+1;
        int thisDay = calendar.get(Calendar.DATE);
        int leapDay = getLeapDay(thisYear);
        int numDaysThisYear = getDayOfYear(thisDay, thisMonth, leapDay);

        System.out.println("Please enter your birthday:");
        System.out.print("What is the month (1-12): ");
        int birthMonth = in.nextInt();
        System.out.print("What is the day   (1-31): ");
        int birthDay = in.nextInt();
        int numDaysBirthday = getDayOfYear(birthDay, birthMonth, leapDay);

        // Handle negative remainder.
        // See http://stackoverflow.com/a/4412200/1830334.
        int a = numDaysBirthday - numDaysThisYear;
        int b = 365;
        int daysUntil = (a % b + b) % b;
        System.out.println("Your birthday is in " + daysUntil + " days");
    }
}
