package recursion_2;

import java.util.Arrays;

/**
 * Created by polarbear on 6/13/17.
 */
public class NQueens_Jul11 {
    public static void main(String[] a) {
        NQueens_Jul11 mySolution = new NQueens_Jul11();
        mySolution.nQueens(5);


    }

    public void nQueens(int n) {
        if (n <= 0) {
            return;
        }
        int[] results = new int[n];
        nQueens(n, 0, results);
    }

    private void nQueens(int n, int level, int[] results) {
        if (level == n) {
            System.out.println(Arrays.toString(results));
            System.out.println();
        }
        boolean[] occupied = new boolean[n];
        for (int i = 0; i < level; i++) {
            occupied[results[i]] = true;
            int leftReach = results[i] - level + i;
            int rightReach = results[i] + level - i;

            if (leftReach >= 0) {
                occupied[leftReach] = true;
            }
            if (rightReach <= n - 1) {
                occupied[rightReach] = true;
            }

        }
        for (int i = 0; i <n; i++) {
            if (!occupied[i]) {
                results[level] = i;
                nQueens(n, level + 1, results);
            }
        }

    }

}
