/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class prints the lyrics to the "Twelve Days of Christmas". See:
 * http://en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_%28song%29.
 */

public class TwlvDys {

    // Use two String arrays to map between the days and the gifts and the days
    // and the ordinals.
    private static final String[] day2gift;
    private static final String[] day2ordinal;
    static {
        day2gift = new String[] {
            "a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "calling Birds",
            "gold rings", "geese a-laying", "swans a-swimming", "maids a-milking",
            "ladies dancing", "lords a-leaping", "pipers piping", "drummers drumming"
        };
        day2ordinal = new String[] {
            "first", "second", "third", "fourth",
            "fifth", "sixth", "seventh", "eighth",
            "ninth", "tenth", "eleventh", "twelfth"
        };
    }

    // The stanza() method clarifies what the code is doing, rather than rely
    // on two nested for loops.
    private static void stanza(int day) {
        String indent = "  ";
        System.out.println("On the " + day2ordinal[day] + " day of Christmas my true love gave to me");
        for (int i = day; i >= 0; i--) {
            if (i == 0 && day != 0) {
                System.out.println(indent + "and " + day2gift[i]);
            } else {
                System.out.println(indent + day2gift[i]);
            }
        }
    }

    public static void main(String[] args) {
        for (int day = 0; day < 12; day++) {
            stanza(day);
            if (day != 12) {
                System.out.println("");
            }
        }
    }
}
