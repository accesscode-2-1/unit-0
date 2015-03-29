import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        Dictionary dictionary = new Dictionary("words");

        ArrayList<String> results = dictionary.fullSearch("pple");
        System.out.println(results);
        System.out.println(results.size());
    }
}
