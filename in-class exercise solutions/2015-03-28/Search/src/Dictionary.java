import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private final ArrayList<String> words;

    public Dictionary(String filename) throws FileNotFoundException {
        words = new ArrayList<String>();

        Scanner scanner = new Scanner(new File(filename));
        while(scanner.hasNext()) {
            String word = scanner.nextLine();
            words.add(word);
        }
    }

    public ArrayList<String> fullSearch(String term) {
        ArrayList<String> results = new ArrayList<String>();
        for(String word: words) {
            if(word.contains(term)) {
                results.add(word);
            }
        }
        return results;
    }

    public ArrayList<String> prefixSearch(String term) {
        ArrayList<String> results = new ArrayList<String>();
        for(String word: words) {
            if(word.startsWith(term)) {
                results.add(word);
            }
        }
        return results;
    }

    public ArrayList<String> suffixSearch(String term) {
        ArrayList<String> results = new ArrayList<String>();
        for(String word: words) {
            if(word.endsWith(term)) {
                results.add(word);
            }
        }
        return results;
    }
}