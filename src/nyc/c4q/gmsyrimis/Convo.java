package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/5/15.
 */
import java.util.Scanner;

public class Convo {
    public static void main(String[] args){
        System.out.println("Hey, who the hell are you?");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.println(name + " Why don't you go get me a coffee and explain why am I stuck in this thing?");
        String because = keyboard.nextLine();
        System.out.println("I don't want to hear this \"" + because + "\" bullshit!");
        System.out.println("Get me out of here!");
    }
}
