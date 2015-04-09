import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "moby.paragraph1.txt";

        // add your own words here for testing purposes
        Set<String> bannedWords = new HashSet<String>();

        Concordance concordance  = new Concordance(filename, bannedWords);

        System.out.println("lines for 'some': " + concordance.findLineNumbers("some"));
        System.out.println();

        System.out.println("Printing concordance:");
        concordance.print();
        System.out.println();

        System.out.println("common lines for 'little' and 'part': " + concordance.getCommonLines("little", "part"));
        System.out.println();

        System.out.println("Printing JSON:");
        concordance.printJson();
    }
}