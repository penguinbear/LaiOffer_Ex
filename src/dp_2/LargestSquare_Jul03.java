package dp_2;

/**
 * Created by polarbear on 6/13/17.
 */
public class LargestSquare_Jul03 {
    public static void main(String[] a) {//
        LargestSquare_Jul03 mySolution = new LargestSquare_Jul03();
        System.out.println(mySolution.largest(null));
        System.out.println(mySolution.largest(new int[][]{}));
        int[][] grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};


        System.out.println(mySolution.largest(grid));
        int[][] m = {{0, 1, 1, 0}, {1, 1, 1, 1}, {0, 0,0,0}};
        System.out.println(mySolution.largest(m));


    }
    public int largest(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[][] largest = new int[matrix.length][matrix[0].length];
        int global = 0;
        for (int i = 0; i < largest.length; i++) {
            for (int j = 0; j < largest[0].length; j++) {
                if (i == 0 || j == 0) {
                    largest[i][j] = matrix[i][j] == 1 ? 1 : 0;
                } else if (matrix[i][j] == 1) {
                    largest[i][j] = Math.min(Math.min(largest[i - 1][j], largest[i][j - 1]), largest[i - 1][j - 1]);
                    largest[i][j] ++;
                }
                global = Math.max(global, largest[i][j]);
            }
        }

        return global;


    }



}
