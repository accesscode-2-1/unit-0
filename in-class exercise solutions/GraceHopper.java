/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class searches a Grace Hopper quote for search word provided by the
 * user.
 */

import java.util.Scanner;

public class GraceHopper {

    public static void main(String[] args) {
        String text = "We must include in any language with which we hope " +
                "to describe complex data-processing situations the " +
                "capability for describing data. We must also include a " +
                "mechanism for determining the priorities to be applied to " +
                "the data. These priorities are not fixed and are indicated " +
                "in many cases by the data. Thus we must have a language and " +
                "a structure that will take care of the data descriptions and " +
                "priorities, as well as the operations we wish to perform. If " +
                "we think seriously about these problems, we find that we " +
                "cannot work with procedures alone, since they are " +
                "sequential. We need to define the problem instead of the " +
                "procedures. The Language Structures Group of the Codasyl " +
                "Committee has been studying the structure of languages " +
                "that can be used to describe data-processing problems. The " +
                "Group started out by trying to design a language for " +
                "stating procedures, but soon discovered that what was " +
                "really required was a description of the data and a " +
                "statement of the relationships between the data sets. The " +
                "Group has since begun writing an algebra of processes, the " +
                "background for a theory of data processing. Clearly, we " +
                "must break away from the sequential and not limit the " +
                "computers. We must state definitions and provide for " +
                "priorities and descriptions of data. We must state " +
                "relationships, not procedures.";

        // Lowercase word to simplify search.
        text = text.toLowerCase();

        int count = 0;
        int searchIdx = 0;

        System.out.print("Give me a word to search for: ");
        Scanner in = new Scanner(System.in);
        String searchWord = in.next();
        char searchChar = searchWord.charAt(0);

        for (int i = 0; i < text.length()-1; i++) {
            // The current character in Grace Hopper's quote.
            char c = text.charAt(i);
            char n = text.charAt(i+1);
            // If the characters match...
            if (c == searchChar) {
                // ...and we're at the end of the search word...
                if (searchIdx == searchWord.length()-1) {
                    // ...and end of the word in text:
                    if (n == ' ' || n == '.' || n == '-' || n == ',') {
                        count++;
                    }
                    // We either found a match or the prefix of a word, e.g.:
                    // "statement" instead of "state". In either case, reset.
                    searchIdx = 0;
                    searchChar = searchWord.charAt(0);
                // ...look for the next character.
                } else {
                    searchIdx++;
                    searchChar = searchWord.charAt(searchIdx);
                }
            // No match; reset our tracking variables.
            } else {
                searchIdx = 0;
                searchChar = searchWord.charAt(0);
            }
        }
        System.out.println("The word \"" + searchWord + "\" appears " + count + " times.");
    }
}