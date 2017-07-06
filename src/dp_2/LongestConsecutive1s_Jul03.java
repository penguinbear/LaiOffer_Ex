package dp_2;

/**
 * Created by polarbear on 5/28/17.
 */
public class LongestConsecutive1s_Jul03 {
    public static void main(String[] a){
        LongestConsecutive1s_Jul03 mySolution = new LongestConsecutive1s_Jul03();

        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{0,1,0,1,1,1,0};

        for(int i =0 ; i < array.length ; i++) {
            System.out.println(mySolution.longest(array[i]));
        }


    }

    public int longest(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] longest = new int[array.length];
        longest[0] = array[0];
        int global = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 1) {
                longest[i] = longest[i - 1] + 1;
            } else {
                longest[i] = 0;
            }
            global = Math.max(global, longest[i]);
        }
        return global;
    }
}
