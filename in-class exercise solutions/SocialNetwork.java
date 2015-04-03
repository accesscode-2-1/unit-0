import java.util.HashSet;

public class SocialNetwork {

    public static void main(String[] args) {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Jamal");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Sebastian");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        //System.out.println( allFriends(yours, mine) );
        //System.out.println( mutualFriends(yours, mine) );
        //System.out.println( justYourFriends(yours, mine) );
        //System.out.println( justMyFriends(yours, mine) );
        //System.out.println( exclusiveFriends(yours, mine) );
        //System.out.println( yourFriendsAreMine(yours, mine) );
        //System.out.println( youHaveFriends(yours) );
        //System.out.println( matchmaker(yours, mine) );
    }

    /*public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal, Eve, Sebastian, Mala
    }*/

    /*public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine) {
        // Eve
    }*/

    /*public static HashSet<String> justYourFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal
    }*/

    /*public static HashSet<String> justMyFriends(HashSet<String> yours, HashSet<String> mine) {
        // Sebastian, Mala
    }*/

    /*public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal, Sebastian, Mala
    }*/

    /*public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine) {
        // true if all your friends are also my friends
    }*/

    /*public static boolean youHaveFriends(HashSet<String> yours) {
        // true if you have any friends
    }*/

    /*public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine) {
        // should return these sets:

        // Sebastian, Jamal
        // Jamal, Mala
        // Jamal, Eve

        // Sebastian, Yelena
        // Yelena, Mala
        // Yelena, Eve

        // Sebastian, Eve
        // Mala, Eve
    }*/
}
