import java.util.HashMap;

public class TwlvDysHM {

    public static void main(String[] args) {

        HashMap<Integer, String> ordinals = new HashMap<Integer, String>();
        ordinals.put(1, "first");
        ordinals.put(2, "second");
        ordinals.put(3, "third");
        ordinals.put(4, "fourth");
        ordinals.put(5, "fifth");
        ordinals.put(6, "sixth");
        ordinals.put(7, "seventh");
        ordinals.put(8, "eighth");
        ordinals.put(9, "nineth");
        ordinals.put(10, "tenth");
        ordinals.put(11, "eleventh");
        ordinals.put(12, "twelfth");

        HashMap<Integer, String> gifts = new HashMap<Integer, String>();
        gifts.put(1, "a Partridge in a Pear Tree");
        gifts.put(2, "two Turtle Doves");
        gifts.put(3, "three French Hens");
        gifts.put(4, "calling Birds");
        gifts.put(5, "gold rings");
        gifts.put(6, "geese a-laying");
        gifts.put(7, "swans a-swimming");
        gifts.put(8, "maids a-milking");
        gifts.put(9, "ladies dancing");
        gifts.put(10, "lords a-leaping");
        gifts.put(11, "pipers piping");
        gifts.put(12, "drummers drumming");

        String indent = "  ";
        for (int day = 1; day <= 12; day++) {
            System.out.println("On the " + ordinals.get(day) + " day of Christmas my true love gave to me");
            for (int i = day; i >= 1; i--) {
                if (i == 1 && day != 1) {
                    System.out.println(indent + "and " + gifts.get(i));
                } else {
                    System.out.println(indent + gifts.get(i));
                }
            }
        }
    }
}
