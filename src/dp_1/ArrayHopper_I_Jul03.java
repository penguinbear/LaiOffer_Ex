package dp_1;

/**
 * Created by polarbear on 5/28/17.
 */
public class ArrayHopper_I_Jul03 {
    public static void main(String[] a){
        ArrayHopper_I_Jul03 mySolution = new ArrayHopper_I_Jul03();

        int[][] array = new int[10][];
        array[0] = new int[]{};
        array[1] = new int[]{1};
        array[2] = new int[]{1,3,2,0,3};
        array[3] = new int[]{2,1,1,0,2};
        array[4] = new int[]{2,1};
        array[5] = new int[]{1, 3, 5, 7, 9, 8, 6, 4, 2, 0};

        for(int i =0 ; i < array.length ; i++) {
            System.out.println(mySolution.canJump(array[i]));
        }


    }

    public boolean canJump(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        boolean[] canJump = new boolean[array.length];
        canJump[array.length - 1] = true;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (canJump[j] && j - i <= array[i]) {
                    canJump[i] = true;
                }
            }
        }

        return canJump[0];
    }
}
