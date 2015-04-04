import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "moby.paragraph1.txt";
        Concordance concordance  = new Concordance(filename);

        System.out.println("lines for 'some': " + concordance.findLineNumbers("some"));
        System.out.println();

        //System.out.println("Printing concordance:");
        //concordance.print();
        //System.out.println();

        System.out.println("common lines for 'little' and 'part': " + concordance.getCommonLines("little", "part"));
    }
}