package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/3/15.
 */
public class Mumbo {

    public static void main(String[] args) {

        String[] days;

        days = new String[12];

        days[0] = "First";
        days[1] = "Second";
        days[2] = "Third";
        days[3] = "Fourth";
        days[4] = "Fifth";
        days[5] = "Sixth";
        days[6] = "Seventh";
        days[7] = "Eighth";
        days[8] = "Nineth";
        days[9] = "Tenth";
        days[10] = "Eleventh";
        days[11] = "Twelveth";

        String[] gifts;

        gifts = new String[12];

        gifts[0] = "a Partridge in a Pear Tree.";
        gifts[1] = "Two Turtle Doves";
        gifts[2] = "Three French hens";
        gifts[3] = "Four Calling Birds";
        gifts[4] = "Five Gold Rings";
        gifts[5] = "Six Geese a-Laying";
        gifts[6] = "Seven Swans a-Swimming";
        gifts[7] = "Eight Maids a-Milking";
        gifts[8] = "Nine Ladies Dancing";
        gifts[9] = "Ten Lords a-Leaping";
        gifts[10] = "Eleven Pipers Piping";
        gifts[11] = "Twelve Drummers Drumming";



            String bottom = "";//initializing an empty string to build up the many gifts said in the second block of the verse
            for (int g = 0; g < gifts.length; g++) {//this is to loop through the array until the end of its length
                int d=g;//this associates the days with the gifts, this was the most important part of my code
                bottom = gifts[g] + "\n" + bottom;//this makes the gifts array actually contain the second block of each verse instead on the special gift given on the day
                gifts[g]=bottom;//as mentioned above we are rebuilding our array with the bottom block of the verse.
                System.out.println("On the " + days[d] + " day of Christmas my true love sent to me");//prints first sentence of song
                System.out.println(gifts[g]);//prints the contents of the array which is now the second block of each verse


            }

        }
    }

