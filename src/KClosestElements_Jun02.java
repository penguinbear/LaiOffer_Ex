import java.util.Arrays;

/**
 * Created by vincenthu on 6/2/17.
 */
public class KClosestElements_Jun02 {


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



        KClosestElements_Jun02 myBS = new KClosestElements_Jun02();

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(myBS.kClosest(array[i], 11, 0)));

        }
    }

    public int[] kClosest(int[] array, int target, int k) {
        // Write your solution here.
        if(array == null || k < 0 || k > array.length) {
            return null;
        }

        if(k == 0 || array.length == 0) {
            return new int[]{};
        }


        int start = 0;
        int end = array.length - 1;
        while(start < end - 1) {
            int mid = start + (end - start) / 2;
            if(array[mid] == target) {
                end = mid;
            } else if (array[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        //post-processing
        int[] k_closest = new int[k];
        int i = 0;

        int k_start_element = start;
        int k_end_element = end;
        while(k>0) {
            if(Math.abs(target - array[k_start_element]) < Math.abs(target - array[k_end_element])) {
                k_closest[i] = array[k_start_element];
                k_start_element--;

            } else {
                k_closest[i] = array[k_end_element];
                k_end_element++;
            }
            k--;
            i++;
            if(k_start_element < 0) {
                for(; i < k_closest.length ; i++) {
                    k_closest[i] = array[k_end_element];
                    k_end_element++;
                }
                break;
            }
            if(k_end_element > array.length - 1) {
                for(; i < k_closest.length ; i++) {
                    k_closest[i] = array[k_start_element];
                    k_start_element--;
                }

                break;
            }
        }

        //build the result array
        /*
        int[] k_closest = new int[k_end_element - k_start_element - 1];
        for(int i = k_start_element + 1, j = 0; i < k_end_element ; i++, j++) {
            k_closest[j] = array[i];
        }
        */
        return k_closest;

    }
}
