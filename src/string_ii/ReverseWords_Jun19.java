package string_ii;

/**
 * Created by polarbear on 6/13/17.
 */
public class ReverseWords_Jun19 {
    public static void main(String[] a) {//
        ReverseWords_Jun19 mySubSets = new ReverseWords_Jun19();
        //System.out.println(mySubSets.rightShift(null));
        //System.out.println(mySubSets.rightShift(new String()));


        //System.out.println(mySubSets.reverseWords("abc"));
        System.out.println(mySubSets.reverseWords("I love Google"));
        System.out.println(mySubSets.reverseWords("12"));



    }
    public String reverseWords(String input) {
        if (input == null || input.length() < 3) {
            return input;
        }

        int s = 0;
        int f = 0;
        char[] a = input.toCharArray();
        while (f < a.length) {
            if (a[f] != ' ' && (f + 1 == a.length || a[f + 1] == ' ')) {
                reverse(a, s, f + 1);
                //assume that words are separated by single space
                f += 2;
                s = f;
            } else {
                f++;
            }
        }
        reverse(a, 0, a.length);
        return String.valueOf(a);

    }

    private void reverse(char[] a, int start, int end) {
        //Write your solution here.
        if (a == null || start + 1 >= end) {
            return;
        }

        for (int i = start; i < start + (end - start) / 2; i++) {
            swap(a, i, end - 1 - (i - start));
        }

    }

    private void swap(char[] array, int a, int b) {
        char tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;

    }


}
