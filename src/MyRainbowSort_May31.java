import java.util.Arrays;

/**
 * Created by vincenthu on 5/31/17.
 */
public class MyRainbowSort_May31 {

    public static void main(String[] a){
        //main();
        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{0};
        array[3] = new int[]{-1};
        array[4] = new int[]{1, 0};
        array[5] = new int[]{1, 0, -1, 1, 0};

        for(int i =0 ; i < array.length ; i++) {
            //int j = 0;
            System.out.println(Arrays.toString(rainbowSort(array[i])));
            /*
            if (i==0) {
                j = -100;
            }
            j++;
            i = i;
            */

        }


    }

    public static int[] rainbowSort(int[] array) {
        // Write your solution here.
        if (array == null || array.length < 2) {
            return array;
        }
        int n1RightBound = 0;
        int zeroRightBound = 0;
        int p1LeftBound = array.length - 1;

        while(p1LeftBound >= zeroRightBound) {
            int curr = array[zeroRightBound];
            if (curr == -1) {
                swap(array, n1RightBound, zeroRightBound);
                zeroRightBound++;
                n1RightBound++;
            } else if (curr == 0) {
                zeroRightBound ++;
            } else if (curr == 1) {
                swap(array, p1LeftBound, zeroRightBound);
                p1LeftBound--;
            } else {
                return null;
            }
        }
        return array;
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;

    }
}
