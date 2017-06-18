package string_ii;

/**
 * Created by polarbear on 6/13/17.
 */
public class ReverseString_Jun18 {
    public static void main(String[] a) {
        ReverseString_Jun18 mySubSets = new ReverseString_Jun18();
        System.out.println(mySubSets.reverse(null));
        System.out.println(mySubSets.reverse(new String()));


        System.out.println(mySubSets.reverse("  a"));
        System.out.println(mySubSets.reverse("   I     love MTV "));
        System.out.println(mySubSets.reverse("   abc  ed  ef  "));



    }


    public String reverse(String input) {
        //Write your solution here.
        if (input == null || input.length() < 2) {
            return input;
        }

        char[] array = input.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }

        return String.valueOf(array);

    }

    private void swap(char[] array, int a, int b) {
        char tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;

    }


}
