/**
 * Created by vincenthu on 6/2/17.
 */
public class LastOccurrence_Jun02 {


    public static void main(String[] a) {
        int[][] array = new int[10][];
        //array[0] = new int[]{};
        array[0] = new int[]{4, 5};
        array[1] = new int[]{1};
        array[2] = new int[]{0, 3};
        array[3] = new int[]{1, 2, 3, 4, 5};

        array[4] = new int[]{1, 3, 3, 3, 8};
        array[5] = new int[]{4, 5, 8, 10};
        array[6] = new int[]{3, 3, 3, 4, 7, 8};
        array[7] = new int[]{0, 0, 0, 1, 2, 2, 3, 3, 3};


        LastOccurrence_Jun02 myBS = new LastOccurrence_Jun02();

        for (int i = 0; i < array.length; i++) {
            System.out.println(myBS.lastOccur(array[i], 3));

        }
    }

    public int lastOccur(int[] array, int target) {
        // Write your solution here.
        if(array == null || array.length == 0) {
            return -1;
        }


        int start = 0;
        int end = array.length - 1;
        while(start < end - 1) {
            int mid = start + (end - start) / 2;
            if(array[mid] == target) {
                start = mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        //post-processing
        if(array[end] == target) {
            return end;
        } else if(array[start] == target) {
            return start;
        } else {
            return -1;
        }

    }
}
