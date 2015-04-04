import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Concordance {
    private HashSet<String> excludedWords;
    private HashMap<String, Set<Integer>> listing;

    public Concordance(String filename, Set<String> bannedWords) throws FileNotFoundException {
        // add banned words to internal set of excluded words
        excludedWords = new HashSet<String>(bannedWords);
        // why not add "the" in Main?  that depends on whether excluding "the" is
        // a general policy or one that should be set by the user.
        // as defined in the assignment, it's a general policy...
        excludedWords.add("the");

        listing = new HashMap<String, Set<Integer>>();

        // for each line in file
        Scanner fileScanner = new Scanner(new File(filename));
        for(int lineNo = 1; fileScanner.hasNextLine(); lineNo++) {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            // for each word in line
            while(lineScanner.hasNext()) {
                String word = lineScanner.next().toLowerCase();

                // do not include excluded words or words that have length less than 3
                if(excludedWords.contains(word) || word.length() < 3) {
                    continue;
                }

                // have we seen this word yet?
                Set<Integer> lineNumbers = listing.get(word);

                // no, so add a new set from here on...
                if(lineNumbers == null) {
                    lineNumbers = new HashSet<Integer>();
                    listing.put(word, lineNumbers);
                }

                // either way, add the current line number to this word's list
                lineNumbers.add(lineNo);
            }
        }
    }

    public Set<Integer> findLineNumbers(String word) {
        if(listing.containsKey(word))
            return listing.get(word);

        return new HashSet<Integer>(); // empty
    }

    public HashSet<Integer> getCommonLines(String word1, String word2) {
        Set<Integer> lines1 = findLineNumbers(word1);
        Set<Integer> lines2 = findLineNumbers(word2);

        if(lines1.isEmpty() || lines2.isEmpty()) {
            return new HashSet<Integer>(); // empty
        }

        HashSet<Integer> copy = new HashSet<Integer>(lines1);

        //set intersection
        copy.retainAll(lines2);

        return copy;
    }

    public void print() {
        for(String word: listing.keySet()) {
            System.out.println(word + ": " + listing.get(word));
        }
    }

    public void printJson() {
        System.out.println("{");
        System.out.println("   \"concordance\": [");

        int i = 0;
        int numKeys = listing.keySet().size();
        for(String word: listing.keySet()) {
            System.out.println("      {");
            System.out.println("        \"word\": \"" + word + "\",");
            System.out.println("        \"lines\": " + listing.get(word));
            System.out.print("      }");
            i++;
            if(i != numKeys)
                System.out.println(",");
            else
                System.out.println("");
        }
        System.out.println("   ]");
        System.out.println("}");
    }
}
