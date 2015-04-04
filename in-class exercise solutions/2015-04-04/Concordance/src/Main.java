import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "moby.paragraph1.txt";
        Concordance concordance  = new Concordance(filename);

        System.out.println("lines for 'some': " + concordance.findLineNumbers("some"));
    }
}