import java.util.HashSet;

public class SocialNetwork {

    public static void main(String[] args) {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Yasiko");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Maddie");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        //System.out.println( allFriends(yours, mine) );
        //System.out.println( mutualFriends(yours, mine) );
        //System.out.println( yourFriends(yours, mine) );
        //System.out.println( myFriends(yours, mine) );
        //System.out.println( exclusiveFriends(yours, mine) );
        //System.out.println( yourFriendsAreMine(yours, mine) );
        //System.out.println( youHaveFriends(yours, mine) );
        //System.out.println( matchmaker(yours, mine) );
    }

    /*public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Yasiko, Eve, Maddie, Mala
    }*/

    /*public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine) {
        // Eve
    }*/

    /*public static HashSet<String> yourFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Yasiko
    }*/

    /*public static HashSet<String> myFriends(HashSet<String> yours, HashSet<String> mine) {
        // Maddie, Mala
    }*/

    /*public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Yasiko, Maddie, Mala
    }*/

    /*public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine) {
        // true if all your friends are also my friends
    }*/

    /*public static boolean youHaveFriends(HashSet<String> yours) {
        // true if you have any friends
    }*/

    /*public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine) {
        [Maddie, Yasiko]
        [Yasiko, Mala]
        [Yasiko, Eve]

        [Maddie, Yelena]
        [Yelena, Mala]
        [Yelena, Eve]

        [Maddie, Eve]
        [Mala, Eve]
    }*/
}
