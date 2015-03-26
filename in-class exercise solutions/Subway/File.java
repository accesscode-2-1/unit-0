import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File {

    ArrayList<ArrayList<String>> lines;

    public File(String filename) {
        try {
            Scanner in = new Scanner(new FileReader(filename));
            this.lines = new ArrayList();
            while (in.hasNext()) {
                String[] nextLine = in.nextLine().split(",");
                ArrayList<String> line = new ArrayList(Arrays.asList(nextLine));
                this.lines.add(line);
            }
        } catch (IOException error) {
            System.out.println("Invalid file: " + error);
        }
    }

    public ArrayList<ArrayList<String>> getLines() {
        return this.lines;
    }
}