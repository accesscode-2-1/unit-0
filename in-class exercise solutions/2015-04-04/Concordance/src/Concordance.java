import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Concordance {
    private HashMap<String, Set<Integer>> listing;

    public Concordance(String filename) throws FileNotFoundException {
        listing = new HashMap<String, Set<Integer>>();

        // for each line in file
        Scanner fileScanner = new Scanner(new File(filename));
        for(int lineNo = 1; fileScanner.hasNextLine(); lineNo++) {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            // for each word in line
            while(lineScanner.hasNext()) {
                String word = lineScanner.next().toLowerCase();

                // do not include words that have length less than 3
                if(word.length() < 3) {
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
}
