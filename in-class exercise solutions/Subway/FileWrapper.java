import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileWrapper {

    ArrayList<ArrayList<String>> lines;

    public FileWrapper(String filename) {
        try {
            Scanner in = new Scanner(new FileReader(filename));
            this.lines = new ArrayList();
            while (in.hasNext()) {
                String[] nextLine = in.nextLine().split(",");
                if (nextLine.length == 4) {
                    nextLine = new String[] { nextLine[0], nextLine[1], nextLine[3] };
                }
                nextLine[2] = nextLine[2].replace(" Express", "");
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