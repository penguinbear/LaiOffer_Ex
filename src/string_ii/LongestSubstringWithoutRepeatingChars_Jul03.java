package string_ii;

import java.util.HashMap;

/**
 * Created by polarbear on 6/13/17.
 */
public class LongestSubstringWithoutRepeatingChars_Jul03 {
    public static void main(String[] a) {
        LongestSubstringWithoutRepeatingChars_Jul03 mySubSets = new LongestSubstringWithoutRepeatingChars_Jul03();
        System.out.println(mySubSets.longest(null));
        System.out.println(mySubSets.longest(new String()));


        //System.out.println(mySubSets.longest("bcdfbd"));

        System.out.println(mySubSets.longest("abcabcbbcda"));


    }


    public int longest(String input) {
        //Write your solution here.
        if (input == null) {
            return 0;
        }
        if (input.length() < 2) {
            return input.length();
        }

        int i = 0;
        int j = 1;
        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put(input.charAt(0), 0);
        int global = 1;
        while (j < input.length()) {
            if(hash.containsKey(input.charAt(j))) {
                i = hash.get(input.charAt(j)) + 1;
            } else {
                global = Math.max(global, j - i + 1);
            }
            hash.put(input.charAt(j), j);
            j++;
        }

        return global;


    }


}
