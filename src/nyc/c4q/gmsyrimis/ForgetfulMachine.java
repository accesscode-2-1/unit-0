package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/5/15.
 */
import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args){
        System.out.println("Hey what's up?");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        System.out.println("Oh, is that great! What are you doing tonight?");
        keyboard.nextLine();
        System.out.println("What time you going to bed?");
        keyboard.nextLine();
        System.out.println("What time you got to wake up?");
        keyboard.nextLine();
        System.out.println("I won't remember anything you said. BYE!");
    }
}
