package string_ii;

/**
 * Created by polarbear on 6/13/17.
 */
public class RightShiftByN_Jun18 {
    public static void main(String[] a) {//
        RightShiftByN_Jun18 mySubSets = new RightShiftByN_Jun18();
        //System.out.println(mySubSets.rightShift(null, 100));
        //System.out.println(mySubSets.rightShift(new String(), 2));


        System.out.println(mySubSets.rightShift("abc", 3));
        System.out.println(mySubSets.rightShift("I love Google", 6));
        System.out.println(mySubSets.rightShift("12", 3));



    }
    public String rightShift(String input, int n) {
        if (input == null || input.length() < 2) {
            return input;
        }
        n = n % input.length();
        if (n == 0) {
            return input;
        }

        return reverse(reverse(input.substring(0, input.length() - n))
                + reverse(input.substring(input.length() - n)));
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
