import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

    public Dictionary(String filename) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<String>();

        Scanner scanner = new Scanner(new File(filename));
        while(scanner.hasNext()) {
            String word = scanner.nextLine();
            System.out.println(word);
            words.add(word);
        }
    }

}
