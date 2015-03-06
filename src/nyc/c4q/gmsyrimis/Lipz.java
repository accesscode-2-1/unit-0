package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/5/15.
 */
import java.util.Scanner;

public class Lipz {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Say something human!!");
        String response = keyboard.nextLine();// .next() is recovering a string
        System.out.println(response);

    }
}
