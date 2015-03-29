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
}