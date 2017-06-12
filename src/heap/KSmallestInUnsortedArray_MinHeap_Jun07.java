package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by vincenthu on 6/6/17.
 */
public class KSmallestInUnsortedArray_MinHeap_Jun07 {
    public static void main(String[] a) {
        int[][] array = new int[10][];
        //array[0] = new int[]{};

        array[0] = new int[]{4, 5};
        array[1] = new int[]{1};
        array[2] = new int[]{0, 3};
        array[3] = new int[]{3, 4, 1, 2, 5};

        array[4] = new int[]{8, 2, 2, 1, 1};
        array[5] = new int[]{4, 5, 8, 10};
        array[6] = new int[]{33, 31, 356, 43, 7, 8};
        array[7] = new int[]{10, 0, 30, 11, 2, 2, 3, 3, 3};

        array[8] = new int[]{15, 12, 9, 9, 6, 3, 4};
        array[9] = new int[]{};



        KSmallestInUnsortedArray_MinHeap_Jun07 kSmallest = new KSmallestInUnsortedArray_MinHeap_Jun07();

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(kSmallest.kSmallest(array[i], 2)));

        }
    }

    public int[] kSmallest(int[] array, int k) {
        //corner cases
        if (array == null || k < 0 || k > array.length) {
            return null;
        }
//        List<Integer> list = Arrays.asList(array);
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for (int i = 0; i < array.length; i++) {
            heap.offer(array[i]);
        }


        int[] kSmallest = new int[k];
        for (int i = 0; i < k; i++) {
            kSmallest[i] = heap.poll();
        }

        return kSmallest;
    }

}
