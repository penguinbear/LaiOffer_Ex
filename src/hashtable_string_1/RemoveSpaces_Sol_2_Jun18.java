package hashtable_string_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class RemoveSpaces_Sol_2_Jun18 {
    public static void main(String[] a) {
        RemoveSpaces_Sol_2_Jun18 mySubSets = new RemoveSpaces_Sol_2_Jun18();
        System.out.println(mySubSets.removeSpaces(null));
        System.out.println(mySubSets.removeSpaces(new String()));


        System.out.println(mySubSets.removeSpaces("  a"));
        System.out.println(mySubSets.removeSpaces("   I     love MTV "));
        System.out.println(mySubSets.removeSpaces("   abc  ed  ef  "));
        System.out.println(mySubSets.removeSpaces(" "));



    }


    //Solution 2: keep the first one of spaces between words.
    public String removeSpaces(String input) {
        //Write your solution here.
        if (input == null || input.length() == 0) {
            return input;
        }

        int s = 0;
        int f = 0;
        char[] array = input.toCharArray();
        while (f < array.length) {
            if (array[f] != ' ') {
                array[s++] = array[f++];
                if (f < array.length && array[f] == ' ') {
                    array[s++] = array[f++];
                }
            } else {
                f++;
            }
        }
        if (s > 1 && array[s-1] == ' ') {
            s--;
        }

        return String.valueOf(array, 0, s);

    }



}
