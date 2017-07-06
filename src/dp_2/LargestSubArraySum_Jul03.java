package dp_2;

/**
 * Created by polarbear on 5/28/17.
 */
public class LargestSubArraySum_Jul03 {
    public static void main(String[] a){
        LargestSubArraySum_Jul03 mySolution = new LargestSubArraySum_Jul03();

        int[][] array = new int[6][];
        array[0] = new int[]{-4,-6,-2,-3};
        array[1] = new int[]{1};
        array[2] = new int[]{2,-1,4,-2,1};
        array[3] = new int[]{-2,-1,-3};
        array[4] = new int[]{2,1};
        array[5] = new int[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 0};

        for(int i =0 ; i < array.length ; i++) {
            System.out.println(mySolution.largestSum(array[i]));
        }


    }
/*
    public int largestSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] largest = new int[array.length];
        largest[0] = array[0];
        int global = array[0];
        for (int i = 1; i < array.length; i++) {
            largest[i] = array[i];
            if (largest[i - 1] > 0) {
                largest[i] += largest[i - 1];
            }
            global = Math.max(global, largest[i]);
        }
        return global;
    }
*/
    public int largestSum(int[] a) {
        if (a == null || a.length == 0) {
            return Integer.MIN_VALUE;

        }
        if (a.length == 1) {
            return a[0];

        }
        int prev = a[0];
        int global = a[0];
        int startIndex = 0;
        int solu_startIndex = 0;
        int solu_endIndex = 0;
        for (int  i = 1; i < a.length; i++) {
            if (prev < 0) {
                prev = a[i];
                startIndex = i;

            } else {
                prev = prev + a[i];

            }
            if (global < prev) {
                global = prev;
                solu_startIndex = startIndex;
                solu_endIndex = i;

            }

        }
        System.out.println("the subarray who has the largest sum starts from " + solu_startIndex + " and ends at " + solu_endIndex + "(included)");
        return global;

    }

}
