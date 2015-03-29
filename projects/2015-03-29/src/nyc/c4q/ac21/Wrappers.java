package nyc.c4q.ac21;

public class Wrappers {

    public static void main(String[] args) {
        Integer i = 42;
        // Really means:
        // Integer i = new Integer(42);

        int j = i;
        // Really means:
        // int j = i.intValue();
    }

}
