import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        Dictionary dictionary = new Dictionary("words");

        Scanner inputScanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter term: ");
            String searchTerm = inputScanner.nextLine();

            ArrayList<String> results = dictionary.fullSearch(searchTerm);
            System.out.println("Full results (" + results.size() + "): " + results);

            ArrayList<String> prefixResults = dictionary.prefixSearch(searchTerm);
            System.out.println("Prefix results (" + prefixResults.size() + "): " + prefixResults);

            ArrayList<String> suffixResults = dictionary.suffixSearch(searchTerm);
            System.out.println("Suffix results (" + suffixResults.size() + "): " + suffixResults);

            System.out.println();
        }
    }
}
