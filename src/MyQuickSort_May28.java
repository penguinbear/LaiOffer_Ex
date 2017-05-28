import java.util.Arrays;

/**
 * Created by vincenthu on 5/27/17.
 */
public class MyQuickSort_May28 {
    public static void main(String[] a){
        //main();
        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{2,2};
        array[3] = new int[]{1,2};
        array[4] = new int[]{2,1};
        array[5] = new int[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 0};

        for(int i =0 ; i < array.length ; i++) {
            int j = 0;
            System.out.println(Arrays.toString(quickSort(array[i])));
            if (i==0) {
                j = -100;
            }
            j++;
            i = i;

        }


    }
/*
    public static void main(){
        System.out.println("This is another main funciton");
    }*/

    public static int[] quickSort(int[] array) {
        // Write your solution here
        if (array == null || array.length < 2) {
            return array;
        }
        quickSort(array, 0, array.length - 1);

        return array;
    }


    private static void quickSort(int[] array, int start, int end) {
        if(array == null || end - start < 1) {
            return;
        }

        //pivot is initialized as the first item
        int pivot = start;
        //left is initialized as the right neighbor of pivot
        int left = pivot + 1;

        int right = end;

        while (left <= right) {
            if (array[left] > array[pivot]) {
                swap(array, left, right);
                right--;
            }
            else {
                left++;
            }
        }
        if (array[pivot] > array[right]) {
            swap(array,pivot,right);

        }

        quickSort(array, start, right - 1);
        quickSort(array, right + 1, end);



    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;

    }

}
