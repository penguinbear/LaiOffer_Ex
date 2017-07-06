package string_ii;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by polarbear on 6/13/17.
 */
public class DecompressString_II_Jul03 {
    public static void main(String[] a) {
        DecompressString_II_Jul03 mySubSets = new DecompressString_II_Jul03();
        System.out.println(mySubSets.decompress(null));
        System.out.println(mySubSets.decompress(new String()));


        //System.out.println(mySubSets.longest("bcdfbd"));

        System.out.println(mySubSets.decompress("a1c0b2c4"));


    }


    public String decompress(String input) {
        //Write your solution here.
        if (input == null || input.length() < 2) {
            return null;
        }
        int total = 0;
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i += 2) {
            int repeats = Character.getNumericValue(input.charAt(i + 1));
            if (repeats >= 0 && repeats <= 9) {
                hash.put(input.charAt(i), repeats);
                total += repeats;
            } else {
                return null;
            }
        }
        char[] output = new char[total];
        int offset = 0;

        for (Map.Entry e : hash.entrySet()) {
            int repeats = (int) e.getValue();
            for (int i = 0; i < repeats; i++) {
                output[i + offset] = (char)e.getKey();
            }
            offset += repeats;
        }

        return String.valueOf(output);



    }


}
