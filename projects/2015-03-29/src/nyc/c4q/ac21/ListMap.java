package nyc.c4q.ac21;

import java.util.ArrayList;

public class ListMap {

    /**
     * Adds or replaces an element to the "map" by changing the keys and values columns.
     * @param keys
     *   The array of keys in the "map".
     * @param values
     *   The array of values in the "map".
     * @param key
     *   The key to add or replace in the map.
     * @param value
     *   The value associated with the key.
     */
    public static void put(ArrayList<String> keys, ArrayList<Integer> values, String key, int value) {
        // FIXME: Write this method!
    }

    /**
     * Gets the value from the "map" associated with a key.
     * @param keys
     *   The array of keys in the "map".
     * @param values
     *   The array of values in the "map".
     * @param key
     *   The key to look up.
     * @return
     *   The value associated with the key, or null if the key is not in the "map".
     */
    public static Integer get(ArrayList<String> keys, ArrayList<Integer> values, String key) {
        // FIXME: Write this method!
        return null;
    }

    /**
     * Removes a key and value from the "map", if it is present.
     * @param keys
     *   The array of keys in the "map".
     * @param values
     *   The array of values in the "map".
     * @param key
     *   The key to remove.
     * @return
     *   The value that was associated with the key, or null if the key was not in the "map".
     */
    public static Integer remove(ArrayList<String> keys, ArrayList<Integer> values, String key) {
        // FIXME: Write this method!
        return null;
    }

    public static void main(String[] args) {
        // Create the empty keys and values columns.
        ArrayList<String> keys = new ArrayList<String>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        // Fill in values.
        put(keys, values, "Neptune", 14);
        put(keys, values, "Uranus", 27);
        put(keys, values, "Saturn", 62);
        put(keys, values, "Jupiter", 67);
        put(keys, values, "Mars", 2);
        put(keys, values, "Earth", 14);
        put(keys, values, "Moon", 0);
        put(keys, values, "Venus", 0);
        put(keys, values, "Mercury", 0);
        put(keys, values, "Sun", 8);
        put(keys, values, "Pluto", 5);
        // Oops!  The sun and moon aren't planets.
        remove(keys, values, "Sun");
        remove(keys, values, "Moon");
        // Oops!  Wrong value for Earth; fix it.
        put(keys, values, "Earth", 1);
        // Oops!  Pluto isn't a planet anymore.
        remove(keys, values, "Pluto");

        // Run some tests.  If everything is working, each test should print true.
        Integer num;
        num = get(keys, values, "Sun");
        System.out.println("Sun is missing:       " + (num == null));
        num = get(keys, values, "Mercury");
        System.out.println("Mercury has 0 moons:  " + (num != null && num == 0));
        num = get(keys, values, "Earth");
        System.out.println("Earth has 1 moons:    " + (num != null && num == 1));
        num = get(keys, values, "Moon");
        System.out.println("Moon is missing:      " + (num == null));
        num = get(keys, values, "Saturn");
        System.out.println("Saturn has 62 moons:  " + (num != null && num == 62));
        num = get(keys, values, "Neptune");
        System.out.println("Neptune has 14 moons: " + (num != null && num == 14));
        num = get(keys, values, "Pluto");
        System.out.println("Pluto is missing:     " + (num == null));
    }
}
