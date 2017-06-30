package dp_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class UniquePaths_Jun27 {
    public static void main(String[] a) {//
        UniquePaths_Jun27 mySolution = new UniquePaths_Jun27();
        System.out.println(mySolution.uniquePaths(0,0));
        System.out.println(mySolution.uniquePaths(1,5));
        System.out.println(mySolution.uniquePaths(300,1));

        System.out.println(mySolution.uniquePaths(3,5));

    }
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }

        int[][] paths = new int[m][n];
        paths[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != 0 && j != 0) {
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                } else if (i == 0 && j != 0) {
                    paths[0][j] = paths[0][j - 1];
                } else if (i != 0 && j == 0) {
                    paths[i][0] = paths[i - 1][0];
                }
            }
        }
        return paths[m - 1][n - 1];

    }



}
