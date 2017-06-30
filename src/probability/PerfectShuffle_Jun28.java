package probability;

import java.util.Arrays;

/**
 * Created by vincenthu on 5/31/17.
 */
public class PerfectShuffle_Jun28 {

    public static void main(String[] a){
        //main();
        int[][] array = new int[10][];
        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{1, 2, 3};
        array[2] = new int[]{1, 2, 3};
        array[3] = new int[]{1, 2, 3};
        array[4] = new int[]{1, 2, 3};
        array[5] = new int[]{1, 2, 3};

        PerfectShuffle_Jun28 mySolution = new PerfectShuffle_Jun28();

        for(int i =0 ; i < array.length ; i++) {
            //int j = 0;
            //System.out.println(Arrays.toString(array[i]));

            mySolution.shuffle(array[i]);
            System.out.println(Arrays.toString(array[i]));
            /*
            if (i==0) {
                j = -100;
            }
            j++;
            i = i;
            */

        }


    }

    public void shuffle(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int length = array.length;
        for (int i = length - 1; i > 0; i--) {
            swap(array, i, (int)(Math.random() * (i + 1)));
        }
    }

    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;

    }
}
