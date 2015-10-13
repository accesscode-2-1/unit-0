/**
 * Access Code 2.1
 *
 * Author  Gregory Gundersen
 * Date    March 2015
 *
 * This class draws a parameterizable ASCII art rocket.
 */

public class DrwRckt {

    public static void drawRocket(int size) {
        drawCone(size);
        drawLine(size);
        drawBodyUp(size);
        drawBodyDown(size);
        drawLine(size);
        drawBodyDown(size);
        drawBodyUp(size);
        drawLine(size);
        drawCone(size);
    }

    public static void drawCone(int size) {
        int max = size*2;
        for (int i = 1; i < max; i++) {
            drawConeSlice(i, max-i);
        }
    }

    public static void drawConeSlice(int max, int spacing) {
        String slice = "";
        for (int i = 0; i < spacing; i++) {
            slice += " ";
        }
        for (int i = 0; i < max; i++) {
            slice += "/";
        }
        slice += "**";
        for (int i = 0; i < max; i++) {
            slice += "\\";
        }
        System.out.println(slice);
    }

    public static void drawLine(int size) {
        String line = "+";
        for (int i = 0; i < size*2; i++) {
            line += "*=";
        }
        line += "+";
        System.out.println(line);
    }

    public static void drawBodyUp(int size) {
        for (int i = 1; i <= size; i++) {
            drawDiamondSlice(i, size-i, "/\\");
        }
    }

    public static void drawBodyDown(int size) {
        for (int i = size; i > 0; i--) {
            drawDiamondSlice(i, size-i, "\\/");
        }
    }

    public static void drawDiamondSlice(int numTriangles, int dots, String carrot) {
        String slice = "|";
        for (int i = 0; i < dots; i++) {
            slice += ".";
        }
        for (int i = 0; i < numTriangles; i++) {
            slice += carrot;
        }
        for (int i = 0; i < dots*2; i++) {
            slice += ".";
        }
        for (int i = 0; i < numTriangles; i++) {
            slice += carrot;
        }
        for (int i = 0; i < dots; i++) {
            slice += ".";
        }
        slice += "|";
        System.out.println(slice);
    }

    public static void main(String[] args) {
        drawRocket(3);
    }
}
