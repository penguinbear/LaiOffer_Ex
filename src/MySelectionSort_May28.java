import java.util.Arrays;

/**
 * Created by polarbear on 5/28/17.
 */
public class MySelectionSort_May28 {
    public static void main(String[] a){
        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{2,2};
        array[3] = new int[]{1,2};
        array[4] = new int[]{2,1};
        array[5] = new int[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 0};

        for(int i =0 ; i < array.length ; i++) {
            System.out.println(Arrays.toString(selectionSort(array[i])));
        }


    }

    public static int[] selectionSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        int local_min;

        for (int i=0; i < array.length - 1; i++) {
            local_min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    local_min = j;
                }
            }
            MyQuickSort_May28.swap(array, i, local_min);
        }

        return array;
    }
}
