package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/5/15.
 */
import java.util.Scanner;
public class DumbCalc {
    public static void main(String[] args){
        double number1;
        double number2;
        double number3;
        double answer;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Calculate 3 numbers");
        number1=keyboard.nextDouble();
        number2=keyboard.nextDouble();
        number3=keyboard.nextDouble();
        answer = number1 + number2 + number3;
        System.out.println("You answer is:");
        System.out.println( "(" + number1 +" + "+number2+" + "+number3+") = "+answer);
    }
}
