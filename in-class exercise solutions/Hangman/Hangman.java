import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SecretWord sw = new SecretWord("Test");
        Drawing dwg = new Drawing();
        int misses = 0;

        System.out.println("Let's play Hangman!\n");
        while (true) {
            System.out.println("Word  : " + sw.toString());
            System.out.println(dwg.get(misses));
            System.out.println("Misses: " + misses);
            System.out.print(  "Guess : ");

            char guess = in.next().charAt(0);
            if (sw.isLetter(guess)) {
                sw.set(guess);
            } else {
                misses++;
            }

            if (sw.isGuessed()) {
                System.out.println("You won!");
                System.out.println("The word was: " + sw.toString());
                break;
            }
            if (misses > 5) {
                System.out.println("You lose!");
                System.out.println(dwg.get(misses));
                break;
            }
        }
    }
}
