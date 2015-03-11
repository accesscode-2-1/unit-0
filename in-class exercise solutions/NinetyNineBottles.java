/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class prints the song "99 Bottles of Beer." See:
 * http://en.wikipedia.org/wiki/99_Bottles_of_Beer for lyrics.
 */

public class NinetyNineBottles {

    public static void main(String[] args) {
        for (int beers = 99; beers >= 0; beers--) {
            System.out.println(beers + " bottles of beer on the wall, " + beers + " bottles of beer.");
            if (beers == 0) {
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall...");
            } else {
                System.out.println("Take one down, pass it around, " + (beers - 1) + " bottles of beer on the wall...\n");
            }
        }
    }
}