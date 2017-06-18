package hashtable_string_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class RemoveChar_I_StringBuilder_Jun16 {
    public static void main(String[] a) {
        RemoveChar_I_StringBuilder_Jun16 mySubSets = new RemoveChar_I_StringBuilder_Jun16();
        System.out.println(mySubSets.deDup(null));
        System.out.println(mySubSets.deDup(new String()));


        System.out.println(mySubSets.deDup("aaaabbccbaac"));


    }

    public String deDup(String input) {
        //Write your solution here.
        if (input == null || input.length() < 2) {
            return input;
        }

        StringBuilder helper = new StringBuilder(input);

        int i = 0;
        int j = 1;
        while (j < helper.length()) {
            if (helper.charAt(i) == helper.charAt(j)) {
                j++;
            } else {
                helper.setCharAt(++i, helper.charAt(j++));
            }
        }


        return helper.substring(0, i + 1);
    }



}
