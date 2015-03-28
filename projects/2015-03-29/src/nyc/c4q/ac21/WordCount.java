package nyc.c4q.ac21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    /**
     * Loads words in a text file.
     * @param filename
     *   The name of the file to load.
     * @return
     *   A list of words in the file.
     */
    public static ArrayList<String> getWords(String filename) {
        ArrayList<String> words = new ArrayList<String>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[ .!?,:;-]");

            while (scanner.hasNext()) {
                String word = scanner.next().trim().toLowerCase();
                if (word.length() > 0)
                    words.add(word);
            }
        } catch (FileNotFoundException exception) {
            System.err.println("not found: " + filename);
            return null;
        } catch (IOException exception) {
            System.err.println("IO exception: " + exception + ": " + filename);
            return null;
        }

        return words;
    }

    /**
     * Counts the numer of times each word appears.
     * @param words
     *   A list of words.
     * @return
     *   A hash map from words to the number of times each appears.
     */
    public static HashMap<String, Integer> countWords(ArrayList<String> words) {
        // FIXME: Write this method.
        return null;
    }

    /**
     * Prints a line reporting how many times a word appears.
     * @param counts
     *   A map from word to count.
     * @param word
     *   The word to report on.
     */
    public static void printCount(HashMap<String, Integer> counts, String word) {
        Integer count = counts.get(word.toLowerCase());
        if (count == null)
            count = 0;
        System.out.println("the word '" + word + "' appears " + count + " times");
    }

    public static void main(String[] args) {
        ArrayList<String> words = getWords("state of the union.txt");
        HashMap<String, Integer> counts = countWords(words);
        printCount(counts, "the");
        printCount(counts, "you");
        printCount(counts, "country");
        printCount(counts, "vote");
        printCount(counts, "Congress");
        printCount(counts, "America");
    }
}
