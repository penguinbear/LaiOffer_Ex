import java.util.Arrays;

/**
 * Created by vincenthu on 5/27/17.
 */
public class MergeSort_Jul04 {
    public static void main(String[] a){
        //main();
        int[][] array = new int[6][];
        array[0] = new int[]{3,5,1,2,4,8};
        array[1] = new int[]{1};
        array[2] = new int[]{2,2};
        array[3] = new int[]{3,5,1,2,4,8};
        array[4] = new int[]{2,1};
        array[5] = new int[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 0};
        for(int i =0 ; i < array.length ; i++) {
            int j;
            System.out.println(Arrays.toString(mergeSort(array[i])));
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


    public static int[] mergeSort(int[] array) {
        // Write your solution here.
        if (array == null | array.length < 2) {
            return array;
        }
        int[] result = new int[array.length];
        mergeSort(array, 0, array.length - 1, result);
        return result;
    }

    private static void mergeSort(int[] a, int start, int end, int[] r) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(a, start, mid, r);
        mergeSort(a, mid + 1, end, r);
        merge(a, start, mid, end, r);
    }
    private static void merge(int[] a, int start, int mid, int end, int[] r) {
        int leftCurr = start;
        int rightCurr = mid + 1;
        int resultCurr = start;
        while (leftCurr <= mid && rightCurr <= end) {
            if(a[leftCurr] < a[rightCurr]) {
                r[resultCurr++] = a[leftCurr++];
            } else {
                r[resultCurr++] = a[rightCurr++];
            }
        }

        while (leftCurr <= mid) {
            r[resultCurr++] = a[leftCurr++];
        }
        while (rightCurr <= end) {
            r[resultCurr++] = a[rightCurr++];
        }

        if (end + 1 - start < a.length) {
            for (int i = start; i <= end; i++) {
                a[i] = r[i];
            }
        }


    }

}
