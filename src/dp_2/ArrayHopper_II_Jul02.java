package dp_2;

/**
 * Created by polarbear on 5/28/17.
 */
public class ArrayHopper_II_Jul02 {
    public static void main(String[] a){
        ArrayHopper_II_Jul02 mySolution = new ArrayHopper_II_Jul02();

        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{3,3,1,0,4};
        array[3] = new int[]{2,1,1,0,2};
        array[4] = new int[]{2,1};
        array[5] = new int[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 0};

        for(int i =0 ; i < array.length ; i++) {
            System.out.println(mySolution.minJump(array[i]));
        }


    }

    public int minJump(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int[] min = new int[array.length];
        min[array.length - 1] = 0;

        for (int i = array.length - 2; i >= 0 ; i--) {
            int jumpRange = Math.min(array.length - 1, array[i] + i);
            min[i] = -1;
            for (int j = i + 1; j <= jumpRange; j++) {
                if((min[i] == -1 || min[i] > 1 + min[j]) && min[j] != -1) {
                    min[i] = 1 + min[j];
                }
            }
        }

        return min[0];
    }
}
