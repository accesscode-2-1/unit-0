import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        Scanner in = new Scanner(System.in);

        System.out.println("Give me some numbers to add:");
        while (true) {
            int num = in.nextInt();
            if (num == -2) {
                break;
            }
            numbers.add(num);
        }

        for (int n : numbers) {
            System.out.println( n );
        }

        System.out.println("Thanks!");
    }
}
