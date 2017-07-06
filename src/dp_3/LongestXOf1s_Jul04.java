package dp_3;

/**
 * Created by polarbear on 5/28/17.
 */
public class LongestXOf1s_Jul04 {
    public static void main(String[] a){
        LongestXOf1s_Jul04 mySolution = new LongestXOf1s_Jul04();

        //int[][] array = new int[][]{{0,0,0,0},{1,1,1,1},{0,1,1,1},{1,0,1,1}};
        int[][] array = new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        System.out.println(mySolution.largest(array));

    }

    public int largest(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] leftToRight = consecutiveOnesInRow(matrix, false);
        int[][] rightToLeft = consecutiveOnesInRow(matrix, true);
        int[][] topToDown = consecutiveOnesInCol(matrix, false);
        int[][] downToTop = consecutiveOnesInCol(matrix, true);

        int globalMax = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currMax = Math.min(Math.min(leftToRight[i][j], rightToLeft[i][j]),
                        Math.min(topToDown[i][j], downToTop[i][j]));
                if (globalMax < currMax) {
                    globalMax = currMax;
                }
            }
        }
        return globalMax;


    }


    private int[][] consecutiveOnesInRow(int[][] a, boolean reversed) {
        //assume a is not null and has at least one element
        int rows = a.length;
        int cols = a[0].length;
        int initialCol = reversed ? cols - 1 : 0;
        int[][] results = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            results[i][initialCol] = a[i][initialCol];

        }

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                int colIndex = reversed ? initialCol - j : j;
                if (a[i][colIndex] == 1) {
                    results[i][colIndex] = (reversed? results[i][colIndex + 1] : results[i][colIndex - 1]) + 1;
                } else {
                    results[i][colIndex] = 0;
                }
            }
        }

        return results;
    }
    private int[][] consecutiveOnesInCol(int[][] a, boolean reversed) {
        //assume a is not null and has at least one element
        int rows = a.length;
        int cols = a[0].length;
        int initialRow = reversed ? rows - 1 : 0;
        int[][] results = new int[rows][cols];

        for (int i = 0; i < cols; i++) {
            results[initialRow][i] = a[initialRow][i];

        }

        for (int i = 0; i < cols; i++) {
            for (int j = 1; j < rows; j++) {
                int rowIndex = reversed ? initialRow - j : j;
                if (a[rowIndex][i] == 1) {
                    results[rowIndex][i] = (reversed? results[rowIndex + 1][i] : results[rowIndex - 1][i]) + 1;
                } else {
                    results[rowIndex][i] = 0;
                }
            }
        }

        return results;
    }
}
