import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        Dictionary dictionary = new Dictionary("words");

        ArrayList<String> results = dictionary.fullSearch("ylopho");
        System.out.println(results);
        System.out.println(results.size());

        ArrayList<String> prefixResults = dictionary.prefixSearch("hone");
        System.out.println(prefixResults);
        System.out.println(prefixResults.size());

        ArrayList<String> suffixResults = dictionary.suffixSearch("pple");
        System.out.println(suffixResults);
        System.out.println(suffixResults.size());
    }
}
