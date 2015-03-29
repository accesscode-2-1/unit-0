package nyc.c4q.ac21;

import java.util.HashMap;
import java.util.Scanner;

public class MoonsAndPlanets {

    public static void main(String[] args) {
        HashMap<String, Integer> numberOfMoons = new HashMap<String, Integer>();

        numberOfMoons.put("Earth", 14);
        numberOfMoons.put("Mercury", 0);
        numberOfMoons.put("Mars", 2);
        numberOfMoons.put("Venus", 0);

        Scanner scanner = new Scanner(System.in);
        String planet;
        System.out.print("name a planet: ");
        planet = scanner.next();
        System.out.print("how many moons does " + planet + " have? ");
        int numMoons = scanner.nextInt();
        numberOfMoons.put(planet, numMoons);

        System.out.println(numberOfMoons.get("Texasa"));
    }

}
