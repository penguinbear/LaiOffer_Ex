package dp_3;

/**
 * Created by polarbear on 5/28/17.
 */
public class LargestSubMatrixSum_Jul04 {
    public static void main(String[] a){
        LargestSubMatrixSum_Jul04 mySolution = new LargestSubMatrixSum_Jul04();
        int[][] array = new int[][]{{-1,-2,-3},{-4,-3,-2},{-3,0,-1}};
        //int[][] array = new int[][]{{1,-2,-1,4},{1,-1,1,1},{0,-1,-1,1},{0,0,1,1}};
        //int[][] array = new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        System.out.println(mySolution.largest(array));

    }

    public int largest(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] presumInCol = presumInCol(matrix);
        int globalMax = matrix[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                int[] sums = new int[cols];
                for (int k = 0; k < cols; k++) {
                    if (i == 0) {
                        sums[k] = presumInCol[j][k];
                    } else {
                        sums[k] = presumInCol[j][k] - presumInCol[i - 1][k];
                    }
                }
                int currMax = largestSubArraySum(sums);
                if (globalMax < currMax) {
                    globalMax = currMax;
                }
            }

        }
        return globalMax;


    }


    private int[][] presumInCol(int[][] a) {
        //assume a is not null and has at least one element
        int rows = a.length;
        int cols = a[0].length;
        int[][] results = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0) {
                    results[0][j] = a[0][j];
                } else {
                    results[i][j] = results[i - 1][j] + a[i][j];
                }
            }
        }

        return results;
    }
    private int largestSubArraySum(int[] a) {
        //assume a is not null and has at least one element
        int currMax = a[0];
        int globalMax = a[0];
        for (int i = 1; i < a.length; i++) {
            if (currMax >0) {
                currMax += a[i];
            } else {
                currMax = a[i];
            }

            if (globalMax < currMax) {
                globalMax = currMax;
            }
        }
        return globalMax;
    }
}
