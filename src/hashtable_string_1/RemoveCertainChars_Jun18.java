package hashtable_string_1;

import java.util.HashSet;

/**
 * Created by polarbear on 6/13/17.
 */
public class RemoveCertainChars_Jun18 {
    public static void main(String[] a) {
        RemoveCertainChars_Jun18 mySubSets = new RemoveCertainChars_Jun18();
        System.out.println(mySubSets.remove(null, ""));
        System.out.println(mySubSets.remove(new String(), ""));


        System.out.println(mySubSets.remove("  a", " "));
        System.out.println(mySubSets.remove("   I     love MTV mm", "mM"));
        System.out.println(mySubSets.remove("abcd", "ab"));



    }

    public String remove(String input, String t) {
        //Write your solution here.
        if (input == null || input.length() == 0 || t == null || t.length() == 0) {
            return input;
        }

        char[] array = input.toCharArray();
        //the length of t has to be consumed for this kind of intializing the Hashset
        //HashSet<Character> targets = new HashSet<>((Character[])(Arrays.asList(t.toCharArray())));
        HashSet<Character> targets = new HashSet<>();

        for (int i = 0; i < t.length(); i++) {
            targets.add(t.charAt(i));
        }

        int s = 0;
        int f = 0;

        while (f < array.length) {
            if (targets.contains(array[f])) {
                f++;
            } else {
                array[s++] = array[f++];
            }
        }

        return String.valueOf(array, 0, s);

    }



}
