package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/5/15.
 */
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        double height;
        double weight;
        double bmi;
        String metricORimperial;
        System.out.println("Are you entering in Metric or Imperial system?");
        metricORimperial=keyboard.nextLine();

        if(metricORimperial.equalsIgnoreCase("metric")) {
            System.out.print("Enter your weight: ");
            weight = keyboard.nextDouble();
            System.out.print("Enter your height: ");
            height = keyboard.nextDouble();
            bmi = weight / (height * height);
            System.out.print("Your BMI is " + bmi);
        }
        if(metricORimperial.equalsIgnoreCase("imperial")){
            System.out.print("Enter your weight: ");
            weight = keyboard.nextDouble();
            weight = weight*0.4535;
            System.out.print("Enter your height(inches): ");
            height = keyboard.nextDouble();
            height=height*0.0254;
            bmi = weight / (height * height);
            System.out.print("Your BMI is " + bmi);
        }
    }
}
