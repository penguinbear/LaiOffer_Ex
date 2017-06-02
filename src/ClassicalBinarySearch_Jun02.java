/**
 * Created by vincenthu on 6/2/17.
 */
public class ClassicalBinarySearch_Jun02 {


    public static void main(String[] a) {
        int[][] array = new int[10][];
        /*
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{0, 3};
        array[3] = new int[]{1, 2, 3, 4, 5};

        array[4] = new int[]{1, 3, 3, 3, 8};
        array[5] = new int[]{4, 5, 8, 10};
        */
        array[0] = new int[]{1, 3};
        array[1] = new int[]{3, 3, 4, 7, 8};

        ClassicalBinarySearch_Jun02 myBS = new ClassicalBinarySearch_Jun02();

        for (int i = 0; i < array.length; i++) {
            System.out.println(myBS.binarySearch(array[i], 3));

        }
    }

    public int binarySearch(int[] array, int target) {
        // Write your solution here.
        if(array == null || array.length == 0) {
            return -1;
        }


        int start = 0;
        int end = array.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
