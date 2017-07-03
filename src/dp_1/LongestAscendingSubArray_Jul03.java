package dp_1;

/**
 * Created by polarbear on 5/28/17.
 */
public class LongestAscendingSubArray_Jul03 {
    public static void main(String[] a){
        LongestAscendingSubArray_Jul03 mySolution = new LongestAscendingSubArray_Jul03();

        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{3,3,1,0,4};
        array[3] = new int[]{2,1,1,0,2};
        array[4] = new int[]{2,1};
        array[5] = new int[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 0};
        array[6] = new int[]{7, 2,3,1,5,8,9,6};

        array[7] = new int[]{1, 2,3,3,4,4,5};


        for(int i =0 ; i < array.length ; i++) {
            System.out.println(mySolution.longest(array[i]));
        }


    }

    public int longest(int[] array) {
        if (array == null || array.length == 0) {
            return 0;

        }

        int[] longest = new int[array.length];
        longest[0] = 1;
        int global = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                longest[i] = longest[i - 1] + 1;
            } else {
                longest[i] = 1;
            }
            global = Math.max(global, longest[i]);
        }
        return global;
    }
}
