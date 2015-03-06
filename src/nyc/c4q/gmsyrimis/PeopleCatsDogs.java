package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/5/15.
 */
import java.util.Scanner;

public class PeopleCatsDogs {
    public static void main(String[] args){
        int people;
        int dogs;
        int cats;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 numbers and they will be assigned to people, dogs and cats.");
        System.out.println("Then you'll get the forecast for the end of the world...");
        people = keyboard.nextInt();
        dogs=keyboard.nextInt();
        cats=keyboard.nextInt();
        if (cats>people&&cats>dogs){
            System.out.println("Cats now rule the world.");
        }
        if (cats>people&&cats<dogs){
            System.out.println("A lot of dogs running after cats");
        }
        if (cats<people&&cats>dogs) {
            System.out.println("Most people have cats");
        }
        if (cats<people&&cats<dogs){
            System.out.println("Most people have dogs");
        }
    }
}
