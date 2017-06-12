package Jun_mid_term_check;

import java.util.Arrays;

/**
 * Created by vincenthu on 5/27/17.
 */
public class MidTermCheck_QuickSort_Jun08 {
    public static void main(String[] a){
        //main();
        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{2,2};
        array[3] = new int[]{1,2};
        array[4] = new int[]{2,1};
        array[5] = new int[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 0};

        MidTermCheck_QuickSort_Jun08 myQSort = new MidTermCheck_QuickSort_Jun08();
        for(int i =0 ; i < array.length ; i++) {
            int j;
            myQSort.quickSort(array[i]);
            System.out.println(Arrays.toString(array[i]));
            if (i==0) {
                j = -100;
            }
            i = i;

        }


    }
/*
    public static void main(){
        System.out.println("This is another main funciton");
    }*/



    public void  quickSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        quickSort(a, 0, a.length -1);
    }

    private void  quickSort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivotIndex = end;
        int left = start;
        int right = end - 1;

        while (left <= right) {
            if (a[left] < a[pivotIndex]) {
                left ++;
            } else {
                swap(a, left, right--);
            }
        }

        swap(a, left, pivotIndex);
        pivotIndex = left;
        quickSort(a, start, pivotIndex - 1);
        quickSort(a, pivotIndex + 1, end);
    }

    public void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;

    }

}
