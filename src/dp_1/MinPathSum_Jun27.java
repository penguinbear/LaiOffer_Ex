package dp_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class MinPathSum_Jun27 {
    public static void main(String[] a) {//
        MinPathSum_Jun27 mySolution = new MinPathSum_Jun27();
        System.out.println(mySolution.miniSum(null));
        System.out.println(mySolution.miniSum(new int[][]{}));
        int[][] grid = {{5, 1, 2, 4}, {4, 1, 0, 1}, {0, 3,7,6}};

        System.out.println(mySolution.miniSum(grid));



    }
    public int miniSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int[][] p = new int[grid.length][grid[0].length];
        p[0][0] = grid[0][0];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i != 0 && j != 0) {
                    p[i][j] = Math.min(p[i - 1][j] + grid[i][j], p[i][j - 1] + grid[i][j]);
                } else if (i != 0 && j == 0) {
                    p[i][0] = p[i - 1][0] + grid[i][0];
                } else if (i == 0 && j != 0) {
                    p[0][j] = p[0][j - 1] + grid[0][j];
                }
            }
        }

        return p[grid.length - 1][grid[0].length - 1];

    }



}
