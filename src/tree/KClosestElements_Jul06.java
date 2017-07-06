import java.util.Arrays;

/**
 * Created by vincenthu on 6/2/17.
 */
public class KClosestElements_Jul06 {


    public static void main(String[] a) {
        int[][] array = new int[10][];
        //array[0] = new int[]{};

        array[0] = new int[]{1, 5};
        array[1] = new int[]{1};
        array[2] = new int[]{0, 3};
        array[3] = new int[]{1, 2, 4, 4, 5};

        array[4] = new int[]{1, 1, 2, 2, 8};
        array[5] = new int[]{4, 5, 8, 10};
        array[6] = new int[]{3, 3, 3, 4, 7, 8};
        array[7] = new int[]{0, 0, 0, 1, 2, 2, 3, 3, 3};

        array[8] = new int[]{1, 3, 3, 3, 6, 9, 9, 12, 15};
        array[9] = new int[]{};



        KClosestElements_Jul06 myBS = new KClosestElements_Jul06();

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(myBS.kClosest(array[i], 10, 2)));

        }
    }

    public int[] kClosest(int[] array, int target, int k) {
        // Write your solution here.
        if (array == null || array.length == 0 || k > array.length) {
            return null;
        }
        if (k == 0) {
            return new int[0];
        }

        int start = 0;
        int end = array.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                start = mid;
                end = mid + 1;
            } else if (array[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }


        int[] results = new int[k];
        for (int i = 0; i < results.length; i++) {
            if (start >= 0 && end <= array.length - 1) {
                if (Math.abs(array[start] - target) < Math.abs(array[end] - target)) {
                    results[i] = array[start--];
                } else {
                    results[i] = array[end++];
                }
            } else if (start < 0) {
                results[i] = array[end++];
            } else {
                results[i] = array[start--];
            }
        }

        return results;
    }

}
