import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Subway {

    public static void drawBar(Graphics2D g, Color color, int y, int count, String letter) {
        // Step 4.
        // Implement this method. It takes the Graphics2D instance and some
        // data we need to create a single bar on the bar chart.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static int countEntrances(ArrayList<ArrayList<String>> lines, String subwayLine) {
        // Step 3.
        // Implement this method. It takes an ArrayList of an ArrayList of
        // Strings and the subway line we're interested in and returns the
        // number of entrances for that line.
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        // Create a 500x250 pixel drawing.
        DrawingPanel panel = new DrawingPanel(500, 250);
        // Get a Graphics2D object that we can use to draw on the panel.
        Graphics2D g = panel.getGraphics();

        // Step 1:
        // Modify this String to indicate the full path to the subway
        // data on your computer.
        File f = new File(".../subway-data.txt");

        // Step 2.
        // Get the lines as a nested ArrayList of Strings from the File
        // instance. Make sure everything is working correctly by
        // printing the data.

        // Step 3.
        // Implement countEntrances().

        // Step 3b.
        // Ensure countEntrances is correct! Print out the counts for a few
        // subway lines and ensure they are correct.

        // Step 4.
        // Implement drawBar().
    }

}
