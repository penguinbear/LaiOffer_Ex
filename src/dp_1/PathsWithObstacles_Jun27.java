package dp_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class PathsWithObstacles_Jun27 {
    public static void main(String[] a) {//
        PathsWithObstacles_Jun27 mySolution = new PathsWithObstacles_Jun27();
        System.out.println(mySolution.possiblepath(null));
        System.out.println(mySolution.possiblepath(new int[][]{}));
        int[][] grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};


        System.out.println(mySolution.possiblepath(grid));
        int[][] m = {{0, 1, 0, 0}, {1, 1, 0, 1}, {0, 0,0,0}};
        System.out.println(mySolution.possiblepath(m));


    }
    public int possiblepath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] p = new int[row][col];
        p[0][0] = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    p[i][j] = 0;
                } else {
                    if (i != 0 && j != 0) {
                        p[i][j] = p[i - 1][j] + p[i][j - 1];
                    } else if (i == 0 && j != 0) {
                        p[0][j] = p[0][j - 1];
                    } else if (i != 0 && j == 0) {
                        p[i][0] = p[i - 1][0];
                    }
                }
            }
        }
        return p[row - 1][col - 1];
    }



}
