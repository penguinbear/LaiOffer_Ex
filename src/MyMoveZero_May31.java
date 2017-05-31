import java.util.Arrays;

/**
 * Created by vincenthu on 5/31/17.
 */
public class MyMoveZero_May31 {

    public static void main(String[] a){
        //main();
        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{0};
        array[3] = new int[]{0,-1};
        array[4] = new int[]{1, 0};
        array[5] = new int[]{1, 0, -1, 1, 0};

        for(int i =0 ; i < array.length ; i++) {
            //int j = 0;
            System.out.println(Arrays.toString(moveZero(array[i])));
            /*
            if (i==0) {
                j = -100;
            }
            j++;
            i = i;
            */

        }


    }

    public static int[] moveZero(int[] array) {
        // Write your solution here.
        if (array == null || array.length < 2) {
            return array;
        }
        int i = 0;
        int zeroLeftBound = array.length - 1;

        while(i <= zeroLeftBound) {
            if (array[i] == 0) {
                swap(array, i, zeroLeftBound);
                zeroLeftBound--;
            } else {
                i++;
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
